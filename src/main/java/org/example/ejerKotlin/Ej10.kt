package org.example.ejerKotlin

fun main (args: Array<String>) {
    print("Convertir Celsius a Fahrenheit o Fahrenheit a Celsius? (c / f): ")
    val respuesta = readln()

    if (respuesta == "c") {
        print("Temperatura en grados Celsius: ")
        val celsius= readln().toFloat()
        val fahrenheit = (celsius * 9/5) + 32

        print("Temperatura en Fahrenheit: $fahrenheit")

    }else if (respuesta == "f") {
        print("Temperatura en grados Fahrenheit: ")
        val fahrenheit= readln().toFloat()
        val celsius = (fahrenheit - 32) + 5/9

        print("Temperatura en Fahrenheit: $celsius")
    }

}