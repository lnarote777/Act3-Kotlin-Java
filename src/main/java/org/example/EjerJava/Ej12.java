package org.example.EjerJava;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        System.out.print("Ingrese un número: ");
        String numero = new Scanner(System.in).nextLine();
        String reverse = "";

        for (int i = numero.length() - 1; i >=0; i--) {
            reverse += numero.charAt(i);
        }
        System.out.println(reverse);
    }
}