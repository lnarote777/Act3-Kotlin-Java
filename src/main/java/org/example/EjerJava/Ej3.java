package org.example.EjerJava;

import java.util.Scanner;


public class Ej3 {
    public static void main(String[] args) {
        System.out.println("Introduce el radio de un círculo en cm: ");
        Scanner sc = new Scanner(System.in);
        String respuesta  = sc.nextLine();
        int radio = Integer.parseInt(respuesta);

        double area = 3.14 * (radio * radio);
        System.out.println("El area del círculo es: " + area);
    }
}
