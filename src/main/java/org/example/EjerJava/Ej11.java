package org.example.EjerJava;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        System.out.print("Ingrese un número: ");
        Scanner sc = new Scanner(System.in);
        String respuesta = sc.nextLine();
        int numero = Integer.parseInt(respuesta);

        String fibonacci = "0 1 ";
        int resultado;
        int num1 = 0;
        int num2 = 1;

        int cont = 0;

        while(cont != numero){
            resultado = num1 + num2;
            num1 = num2;
            num2 = resultado;
            fibonacci += resultado + " ";
            cont++;
        }

        System.out.println(fibonacci);
    }
}
