package org.example.EjerJava;

import java.util.Random;
import java.util.Scanner;


public class Ej4 {
    public static void main(String[] args) {

        int num = new Random().nextInt(0, 101);

        System.out.print("Adivina el número -> ");


        boolean acertado = false;
        while(!acertado) {
            String respuesta  = new Scanner(System.in).nextLine();
            int numero = Integer.parseInt(respuesta);

            if (numero == num) {
                System.out.println("Correcto!!!");
                acertado = true;
            }else {
                System.out.print("Incorrecto!! Vuelve a intentarlo ->");
            }
        }


    }
}
