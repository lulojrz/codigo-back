

package com.example.demo.controller;


import com.example.demo.model.Producto;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

    @Autowired
    private ProductRepository productoRepository;


    @GetMapping
    public List<Producto> obtenerTodos() {
        return (productoRepository.findAll());
    }


    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoRepository.save(producto);

    }
    @DeleteMapping("/{id}")
    public String eliminarProducto(@PathVariable Long id){


         productoRepository.deleteById(id);
         return "borrado exitosamente";

    }

    @PutMapping("/{id}")
    public Producto actualizarProducto(@PathVariable Long id, @RequestBody Producto detallesProducto) {

        return productoRepository.findById(id)
                .map(productoExistente -> {
                    productoExistente.setNombre(detallesProducto.getNombre());
                    productoExistente.setEquipo(detallesProducto.getEquipo());
                    productoExistente.setTemporada(detallesProducto.getTemporada());
                    productoExistente.setImg1(detallesProducto.getImg1());
                    productoExistente.setImg2(detallesProducto.getImg2());
                    productoExistente.setCategoria(detallesProducto.getCategoria());
                    productoExistente.setPais(detallesProducto.getPais());
                    productoExistente.setPrecio(detallesProducto.getPrecio());
                    productoExistente.setCantidad(detallesProducto.getCantidad());


                    return productoRepository.save(productoExistente);
                })

                .orElse(null);
    }
}