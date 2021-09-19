package org.iesfm.biblioteca;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;



public abstract class Bibloteca {
    private String nombreBiblio;

    public Bibloteca(String nombreBiblio) {
        this.nombreBiblio = nombreBiblio;
    }

    @Override
    public String toString() {
        return "Bibloteca{" +
                "nombreBiblio='" + nombreBiblio + '\'' +
                '}';
    }

    public String getNombreBiblio() {
        return nombreBiblio;
    }

    public void setNombreBiblio(String nombreBiblio) {
        this.nombreBiblio = nombreBiblio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bibloteca bibloteca = (Bibloteca) o;
        return Objects.equals(nombreBiblio, bibloteca.nombreBiblio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreBiblio);
    }

}


