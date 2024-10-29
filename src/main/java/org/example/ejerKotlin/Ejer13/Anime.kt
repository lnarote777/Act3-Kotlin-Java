package org.example.ejerKotlin.Ejer13

data class Anime (private val nombre: String, private val episodios: Int, private val genero: String){
    override fun toString(): String {
        return "Nombre: $nombre, Episodios: $episodios, Género: $genero"
    }
}