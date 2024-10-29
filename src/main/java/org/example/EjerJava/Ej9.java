package org.example.EjerJava;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        System.out.print("Escribe un número: ");
        String respuesta  = new Scanner(System.in).nextLine();
        int numero = Integer.parseInt(respuesta);
        boolean esPrimo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println("Es primo");
        }else {
            System.out.println("No es primo");
        }
    }
}
