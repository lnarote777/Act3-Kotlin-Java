package org.example.EjerJava;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        System.out.print("Escriba una cadena: ");
        String cadena = new Scanner(System.in).nextLine();
        String reverse = "";


        for (int i = cadena.length() - 1; i >=0; i--) {
            reverse += cadena.charAt(i);
        }
        System.out.println(reverse);
    }
}
