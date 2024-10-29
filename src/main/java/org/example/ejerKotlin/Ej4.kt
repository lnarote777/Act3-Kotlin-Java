package org.example.ejerKotlin

import kotlin.random.Random

fun main() {
    val num = Random.nextInt(0,101)

    print("Adivina el número -> ")

    var acertado = false

    while (!acertado){
        val numero = readln().toInt()
        if (numero == num){
            println("Correcto!!!")
            acertado = true
        }else{
            print("Número incorrecto vuelve a intentarlo -> ")
        }
    }
}