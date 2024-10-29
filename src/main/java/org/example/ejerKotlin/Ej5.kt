package org.example.ejerKotlin

fun main() {
    print("Introduzca un número: ")
    val num = readln().toInt()

    for (i in 0..10) {
        println("$num * $i = ${num*i}")
    }
}