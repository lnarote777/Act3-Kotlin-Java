package org.example.EjerJava;

import java.util.List;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        System.out.println("Escriba un frase");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        char [] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int contVocales = 0;

        for (char letra : frase.toCharArray()) {
            for(char vocal : vocales) {
                if (letra == vocal) {
                    contVocales++;
                }
            }

        }

        System.out.println(contVocales);
    }
}
