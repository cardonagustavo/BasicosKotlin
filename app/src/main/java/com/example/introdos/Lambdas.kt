package com.example.introdos

fun main() {
    val triple: (Int) -> Int = { a: Int -> a * 3 }
    val triple2: (Int) -> Int = { it * 5 }
    println(triple(5))
    println(triple(2))

    val suma = {a: Int, b: Int, c: Int -> a+b+c}
    val resultado = suma(3,6,50)
    println(resultado)



}