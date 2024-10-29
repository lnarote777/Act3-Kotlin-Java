package org.example.ejerKotlin

fun main (args: Array<String>) {
    var suma = 0
    for (i in 1..100){
        suma += i
    }

    println("La suma de los números del 1 al 100 es $suma")
}