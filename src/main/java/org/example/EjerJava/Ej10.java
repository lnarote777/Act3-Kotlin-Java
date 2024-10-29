package org.example.EjerJava;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        System.out.println("Convertir Celsius a Fahrenheit o Fahrenheit a Celsius? (c / f): ");
        String respuesta = new Scanner(System.in).nextLine();

        if (respuesta.equals("c")){
            System.out.println("Temperatura en grados Celsius: ");
            String temp = new Scanner(System.in).nextLine();
            float celsius = Float.parseFloat(temp);
            float fahrenheit = (celsius * 9/5) + 32;

            System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
        }else if (respuesta.equals("f")){
            System.out.println("Temperatura en grados Fahrenheit: ");
            String temp = new Scanner(System.in).nextLine();
            float fahrenheit = Float.parseFloat(temp);
            float celsius = (fahrenheit - 32 ) +  5/9;
            System.out.println("Temperatura en Celsius: " + celsius);
        }
    }
}
