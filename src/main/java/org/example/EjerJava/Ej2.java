package org.example.EjerJava;


import java.util.Scanner;



public class Ej2 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        Scanner sc = new Scanner(System.in);
        String respuesta  = sc.nextLine();
        int numero = Integer.parseInt(respuesta);

        if (numero % 2 == 0){
            System.out.println("El número es par.");
        }else {
            System.out.println("El número no es par.");
        }
    }
}
