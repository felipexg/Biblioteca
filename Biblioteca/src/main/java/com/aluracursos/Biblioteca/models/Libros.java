package com.aluracursos.Biblioteca.models;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.List;


@Entity
@Table(name = "libros")
public class Libros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "autor_id", nullable = false)
    private Autore autor;

    @Column(name = "nombre_autor")
    private String nombreAutor;

    @Column(name = "lenguajes")
    private String lenguajes;
    private double numeroDescargas;

    public Libros() {}

    public Libros(DatosLibros datosLibros, Autore autor) {
        this.titulo = datosLibros.titulo();
        setLenguajes(datosLibros.languages());
        this.numeroDescargas = datosLibros.numeroDescargas();
        this.nombreAutor = autor.getName();
        this.autor = autor;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autore getAutor() {
        return autor;
    }

    public void setAutor(Autore autor) {
        this.autor = autor;
    }

    public List<String> getLenguajes() {
        return Arrays.asList(lenguajes.split(","));
    }

    public void setLenguajes(List<String> lenguajes) {
        this.lenguajes = String.join(",", lenguajes);
    }

    public double getNumeroDescargas() {
        return numeroDescargas;
    }

    public void setNumeroDescargas(double numeroDescargas) {
        this.numeroDescargas = numeroDescargas;
    }

    @Override
    public String toString() {
        return "--------------- LIBRO ---------------" + "\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + nombreAutor + "\n" +
                "Idioma: " + lenguajes + "\n" +
                "Número de descargas: " + numeroDescargas + "\n" +
                "------------------------------------" + "\n";
    }
}
