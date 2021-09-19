package org.iesfm.biblioteca;

import java.util.Objects;

public class SociosBiblioteca extends Bibloteca{
    private String DNI;
    private String Nombre;
    private String Apellidos;
    private int NumSocio;
    private int CodPostal;


    public SociosBiblioteca(String nombreBiblio,String DNI,String Nombre,String Apellidos,int NumSocio,int CodPostal  ) {
        super(nombreBiblio);
        this.DNI= DNI;
        this.Nombre=Nombre;
        this.Apellidos= Apellidos;
        this.NumSocio= NumSocio;
        this.CodPostal=CodPostal;
    }

    @Override
    public String toString() {
        return "SociosBiblioteca{" +
                "DNI='" + DNI + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", NumSocio=" + NumSocio +
                ", CodPostal=" + CodPostal +
                '}';
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getNumSocio() {
        return NumSocio;
    }

    public void setNumSocio(int numSocio) {
        NumSocio = numSocio;
    }

    public int getCodPostal() {
        return CodPostal;
    }

    public void setCodPostal(int codPostal) {
        CodPostal = codPostal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SociosBiblioteca that = (SociosBiblioteca) o;
        return NumSocio == that.NumSocio && CodPostal == that.CodPostal && Objects.equals(DNI, that.DNI) && Objects.equals(Nombre, that.Nombre) && Objects.equals(Apellidos, that.Apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), DNI, Nombre, Apellidos, NumSocio, CodPostal);
    }
}
