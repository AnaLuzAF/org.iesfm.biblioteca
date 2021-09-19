package org.iesfm.biblioteca;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class LibrosCatalogo extends Bibloteca {
    private String ISBN;
    private String Titulo;
    private String Autor;
    public List <String> generos= Arrays.asList("Terror, Ciencia Ficcion, Aventuras, Drama,Infantil, Accion");

    public LibrosCatalogo(String ISBN, String Titulo, String Autor, List<String> generos, String nombreBiblio) {
        super(nombreBiblio);
        this.ISBN= ISBN;
        this.Titulo= Titulo;
        this.Autor= Autor;
        for (String g : this.generos = generos) {
            System.out.println(generos.size());
        }

    }

    @Override
    public String toString() {
        return "LibrosCatalogo{" +
                "ISBN='" + ISBN + '\'' +
                ", Titulo='" + Titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", generos=" + generos +
                '}';
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LibrosCatalogo that = (LibrosCatalogo) o;
        return Objects.equals(ISBN, that.ISBN) && Objects.equals(Titulo, that.Titulo) && Objects.equals(Autor, that.Autor) && Objects.equals(generos, that.generos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ISBN, Titulo, Autor, generos);
    }
}
