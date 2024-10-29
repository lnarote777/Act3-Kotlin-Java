package org.example.EjerJava;

import java.util.Scanner;


public class Ej1 {
    public static void main(String[] args){
        System.out.print("Escriba su nombre -> ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.print("Hola " + nombre);
    }
}
