package org.example.ejerKotlin

fun main() {
    print("Introduzca el radio de un círculo en centímetros: ")
    val radio = readln().toInt()

    val area = 3.14 * (radio * radio)

    println("El area del círculo es: $area")
}