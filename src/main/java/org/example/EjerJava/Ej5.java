package org.example.EjerJava;

import java.util.Scanner;



public class Ej5 {
    public static void main(String[] args) {
        System.out.println("Introduzca un número: ");
        Scanner sc = new Scanner(System.in);
        String respuesta  = sc.nextLine();
        int numero = Integer.parseInt(respuesta);

        for (int i = 0; i <= 10 ; i++) {
            System.out.println(numero + " * " + i + " = " + numero * i);
        }
    }
}
