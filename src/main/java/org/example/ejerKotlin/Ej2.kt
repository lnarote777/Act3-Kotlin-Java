package org.example.ejerKotlin

fun main() {
    print("Introduzca un número: ")
    val num = readln().toInt()

    if (num % 2 == 0) {
        println("El numero $num es par")
    }else{
        println("El numero $num es impar")
    }
}