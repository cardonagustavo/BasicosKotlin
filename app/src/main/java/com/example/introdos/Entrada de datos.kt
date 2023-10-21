package com.example.introdos

fun main () {
    println("Ingresa los siqguientes datos:")
    print("Calle: ")
    val calle = readln()

    print("Ciudad: ")
    val ciudad = readln()

    print("Departamento: ")
    val departamento = readln()

    print("Pais: ")
    val pais = readln()

    print("Codigo postal: ")
    val codigoPostal = readln()


    //println("Tu nombre es: " + nombre + "y apellido: " + apellido)

    //println("Tu nombre es: $nombre y apellido es: $apellido")

    println(
        """"
        *** Datos +++
        Calle: $calle
        Ciudad: $ciudad
        Departamento: $departamento
        Pais: $pais
        Codigo Postal: $codigoPostal
        """.trimIndent()
    )
}
