package com.example.introdos

fun main () {
    val nombre: String = "Gus"
    println(nombre.length)


    val nombre2: String? = null
    println(nombre2?.length)

    val nombre3: String? = "null"
    println(nombre3?.length)


    //el elvis operatos, nos permite imprimir otra cosa que no sea null, podemos retormnar otra variable.
    val nombre4: String? = null
    val a = nombre.length ?: "Leo".length
    println(a)

    val nombre5: String? = "Andres"
    nombre5?.let {
        println(it)
    }
}