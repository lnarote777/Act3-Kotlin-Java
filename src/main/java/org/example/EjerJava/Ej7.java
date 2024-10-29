package org.example.EjerJava;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        System.out.print("Escriba una cadena: ");
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        String reverse = "";


        for (int i = cadena.length() - 1; i >=0; i--) {
            reverse += cadena.charAt(i);
        }
        System.out.println(reverse);
    }
}
