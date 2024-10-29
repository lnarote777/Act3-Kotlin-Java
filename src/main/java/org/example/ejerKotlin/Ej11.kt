package org.example.ejerKotlin

fun main(args: Array<String>) {
    print("Ingrese un número: ")
    val num = readln().toInt()

    var fibonacci = "0 1 "
    var resultado: Int

    var num1 = 0
    var num2 = 1

    var cont = 0
    while (cont != num) {
        resultado = num1 + num2
        num1 = num2
        num2 = resultado
        fibonacci += "$resultado "
        cont++
    }

    print(fibonacci)
}