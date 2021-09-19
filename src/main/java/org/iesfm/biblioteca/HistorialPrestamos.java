package org.iesfm.biblioteca;

import java.time.LocalDate;
import java.util.Objects;

public class HistorialPrestamos extends Bibloteca{
    private String ISBN;
    private LocalDate FechaPrestamo;
    private String DNISocio;
    private LocalDate FechaDevolucion;


    public HistorialPrestamos(String nombreBiblio, String ISBN,LocalDate FechaPrestamo,String DNISocio,LocalDate FechaDevolucion) {
        super(nombreBiblio);
        this.ISBN= ISBN;
        this.FechaPrestamo= FechaPrestamo;
        this.DNISocio= DNISocio;
        this.FechaDevolucion= FechaDevolucion;
    }

    @Override
    public String toString() {
        return "HistorialPrestamos{" +
                "ISBN='" + ISBN + '\'' +
                ", FechaPrestamo=" + FechaPrestamo +
                ", DNISocio='" + DNISocio + '\'' +
                ", FechaDevolucion=" + FechaDevolucion +
                '}';
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public LocalDate getFechaPrestamo() {
        return FechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        FechaPrestamo = fechaPrestamo;
    }

    public String getDNISocio() {
        return DNISocio;
    }

    public void setDNISocio(String DNISocio) {
        this.DNISocio = DNISocio;
    }

    public LocalDate getFechaDevolucion() {
        return FechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        FechaDevolucion = fechaDevolucion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HistorialPrestamos that = (HistorialPrestamos) o;
        return Objects.equals(ISBN, that.ISBN) && Objects.equals(FechaPrestamo, that.FechaPrestamo) && Objects.equals(DNISocio, that.DNISocio) && Objects.equals(FechaDevolucion, that.FechaDevolucion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ISBN, FechaPrestamo, DNISocio, FechaDevolucion);
    }
}
