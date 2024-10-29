package org.example.ejerKotlin

fun main() {
    print("Escribe un número: ")
    val num = readln().toInt()

    var esPrimo = true
    for (i in 2..num / 2) {
        if (num % i == 0) {
            esPrimo = false
            break
        }
    }

    if (esPrimo) {
        println("$num es primo")
    }else{
        println("$num no es primo")
    }
}