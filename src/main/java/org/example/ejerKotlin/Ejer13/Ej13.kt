package org.example.ejerKotlin.Ejer13

fun main() {
    print("Añade un anime \nNombre: ")
    val nombre = readln()

    print("Nº episodios: ")
    val episodios = readln().toInt()

    print("Género: ")
    val genero = readln()

    val anime = Anime(nombre, episodios, genero)

    println(anime)
}