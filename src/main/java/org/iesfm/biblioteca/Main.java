package org.iesfm.biblioteca;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    static  public List<String> libros= Arrays.asList("l1,l2,l3,l4,l5");
    public static void main(String[] args) {
        LibrosCatalogo l1= new LibrosCatalogo("565775", "IT", "King", Collections.singletonList("Terror"), "Arroyo");
        LibrosCatalogo l2= new LibrosCatalogo("45767", "El resplandor", "King",Collections.singletonList("Terror"), "Tomas y Valiente");
        LibrosCatalogo l3 = new LibrosCatalogo("748546", "Mago de Oz", "Zeta",Collections.singletonList("Aventuras"),"Hospital Fuenlabrada");
        LibrosCatalogo l4= new LibrosCatalogo("3984738", "Black Panther", "Stan Lee", Collections.singletonList("Accion"), "Arroyo");
        LibrosCatalogo l5= new LibrosCatalogo("38457", "Antes de Ti", "MJ", Collections.singletonList("Drama"), "Tomas y Valiente");

        libros.add(l1.getISBN());
        libros.add(l2.getISBN());
        libros.add(l3.getISBN());
        libros.add(l4.getISBN());
        libros.add(l5.getISBN());

        showInfo(libros);

    }
    public static void showInfo (List<String>libros){

        for (int i=0; i <libros.size(); i++){
            System.out.println(libros);
        }
    }

    public static  void showGenero (List<String>libros){
        for (int i=0; i<libros.size(); i++){
            System.out.println(libros);
        }
    }
    }



