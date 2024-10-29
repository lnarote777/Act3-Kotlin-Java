package org.example.ejerKotlin

fun main() {
    print("Escriba una frase: ")
    val palabra = readln()

    var vocalA = 0
    var vocalE = 0
    var vocalI = 0
    var vocalO = 0
    var vocalU = 0

    for (letra in palabra){
       if (letra == 'a' || letra == 'A'){
           vocalA ++
       }else if (letra == 'e' || letra == 'E'){
           vocalE ++
       }else if (letra == 'i' || letra == 'I'){
           vocalI ++
       }else if (letra == 'o' || letra == 'O'){
           vocalO ++
       }else if (letra == 'u' || letra == 'U'){
           vocalU ++
       }

    }
    println("a: $vocalA, e: $vocalE, i: $vocalI, o: $vocalO, u: $vocalU ")

}