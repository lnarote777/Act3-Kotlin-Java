package org.example.ejerKotlin.Ejer14

fun main() {
    val inventario = mutableListOf<Videojuego>()
    while (true) {
        try {
            println("Elige una opción: " +
                    "\n\t1-Añadir juego " +
                    "\n\t2-Eliminar juego " +
                    "\n\t3-Mostrar listado juegos" +
                    "\n\t0-Salir"
            )
            print("-> ")
            val opcion = readln().toInt()

            when (opcion) {
                1 -> agregar(inventario)
                2 -> eliminar(inventario)
                3 -> mostrar(inventario)
                0 -> break
                else -> println("Opción no válida\n")
            }
        }catch(e:Exception){
            println("Opción no válida\n")
            continue
        }

    }
}

fun agregar(inventario : MutableList<Videojuego>){
    print("Datos del juego" +
            "\nTítulo: ")
    val titulo = readln()

    print("Plataforma: ")
    val plataforma = readln()

    print("Horas jugadas: ")
    val horas = readln().toInt()

    val videojuego = Videojuego(titulo, plataforma, horas)

    inventario.add(videojuego)
    println("El juego se ha añadido a tu biblioteca")
}

fun eliminar(inventario : MutableList<Videojuego>) {
    print("Título del juego que desea eliminar: ")
    val titulo = readln()

    val juego = inventario.find { it.titulo == titulo }
    inventario.remove(juego)

    println("El juego se ha elimindo de tu biblioteca")
}

fun mostrar(inventario : MutableList<Videojuego>) = inventario.forEach{println(it)}
