package org.example.EjerJava;

import java.util.Scanner;


public class Ej1 {
    public static void main(String[] args){
        System.out.print("Escriba su nombre -> ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.print("Hola " + nombre);
    }
}
