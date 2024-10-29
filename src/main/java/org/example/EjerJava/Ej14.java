package org.example.EjerJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Ej14 {
    public static class Videojuego{
        String titulo;
        String plataforma;
        int horas;
    }


    static void agregar(List<Videojuego> videojuegos){

        System.out.println("Ingrese el titulo: ");
        String titulo = new Scanner(System.in).nextLine();
        System.out.println("Ingrese la plataforma: ");
        String plataforma = new Scanner(System.in).nextLine();
        System.out.println("Ingrese las horas jugadas: ");
        int horas = new Scanner(System.in).nextInt();
        Videojuego videojuego = new Videojuego();
        videojuego.titulo = titulo;
        videojuego.plataforma = plataforma;
        videojuego.horas = horas;
        videojuegos.add(videojuego);

        System.out.println("El juego se agregó correctamente.");
    }

    static void eliminar(List<Videojuego> videojuegos){
        System.out.println("Título del juego a eliminar: ");
        String titulo = new Scanner(System.in).nextLine();

        for(Videojuego videojuego : videojuegos){
            if (titulo.equals(videojuego.titulo)){
                videojuegos.remove(videojuego);
            }
        }
    }
    static void mostrar(List<Videojuego> videojuegos){
        for (Videojuego videojuego : videojuegos){
            System.out.println(videojuego);
        }
    }

    public static void main(String[] args) {
        List<Videojuego> videojuegos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            try {
                System.out.println("Elige una opción: " +
                        "\n\t1-Añadir juego " +
                        "\n\t2-Eliminar juego " +
                        "\n\t3-Mostrar listado juegos" +
                        "\n\t0-Salir");
                System.out.print("-> ");


                String opcion = sc.nextLine();
                switch (opcion) {
                    case "1":
                        agregar(videojuegos);
                        break;
                    case "2":
                        eliminar(videojuegos);
                        break;
                    case "3":
                        mostrar(videojuegos);
                        break;
                    case "0":
                        sc.close();
                        return;
                    default:
                        System.out.println("Opción no válida");
                }
            } catch (Exception e) {
                System.out.println("Opción no válida");
                sc.nextLine();
            }
        }

    }
}
