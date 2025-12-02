package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Camisetas")
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer Id;
    private String Nombre;
    private String Equipo;
    private String Temporada;
    private String img1;
    private String img2;
    private String Categoria;
    private String Pais;
    private Double Precio;
    public Integer Cantidad;


    public Integer getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getEquipo() {
        return Equipo;
    }

    public String getTemporada() {
        return Temporada;
    }

    public String getImg1() {
        return img1;
    }

    public String getImg2() {
        return img2;
    }

    public String getCategoria() {
        return Categoria;
    }

    public String getPais() {
        return Pais;
    }

    public Double getPrecio() {
        return Precio;
    }

    // Aunque 'Cantidad' es público, si quisieras un getter siguiendo la convención:
    public Integer getCantidad() {
        return Cantidad;
    }

    // --- Setters ---

    public void setId(Integer id) {
        Id = id;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setEquipo(String equipo) {
        Equipo = equipo;
    }

    public void setTemporada(String temporada) {
        Temporada = temporada;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }


    public void setCantidad(Integer cantidad) {
        Cantidad = cantidad;
    }


}