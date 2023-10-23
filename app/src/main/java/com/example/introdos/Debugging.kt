package com.example.introdos



fun main() {
    print("Ingresa un número: ")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        val resultado = (1..numero).sum()
        println("La suma de los números desde 1 hasta $numero es: $resultado")
    } else {
        println("No ingresaste un número válido.")

    }
    //main()
}