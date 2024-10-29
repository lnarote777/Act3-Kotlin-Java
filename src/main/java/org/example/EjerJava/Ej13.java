package org.example.EjerJava;

import java.util.Scanner;

public class Ej13 {
    public static class Anime {
        String nombre;
        int episodios;
        String genero;

        public Anime(String nombre, int episodios, String genero) {
            this.nombre = nombre;
            this.episodios = episodios;
            this.genero = genero;
        }

        public void mostrarInfo(){
            System.out.println("Nombre: " + nombre + " Episodios: " + episodios + " Genero: " + genero);
        }
    }
    public static void main(String[] args) {
        System.out.println("Añadir anime");
        System.out.print("Nombre: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();

        System.out.print("Episodios: ");
        int episodios = sc.nextInt();

        System.out.print("Género: ");
        String genero = sc.nextLine();

        sc.close();
        Anime anime = new Anime(nombre, episodios, genero);

        anime.mostrarInfo();
    }
}
