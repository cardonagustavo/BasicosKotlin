package com.example.introdos.Classes


fun main() {

    val texto1 = Text("\"Kotlin is a modern but already mature programming language designed to make developers happier. It's concise, safe, interoperable with Java and other languages, and provides many ways to reuse code between multiple platforms for productive programming.\\n\" +\n" +
            "            \"\\n\" +\n" +
            "            \"To start, why not take our tour of Kotlin? This tour covers the fundamentals of the Kotlin programming language.\", ","Juan","Definicioln Kotlin")

    val nota1 = Text.Nota("Diego", "Juan", "Kotlin")

    val auto1 = Text.Auto("Honda", "2025", 200000000)


    texto1.imprimirTotalCaracteresTexto1()
    nota1.imprimirCaracteresTexto2()
    auto1.imprimirCaracteriticasAuto()


    val persona = Text.Persona("Gus","Cardona", "calle 123", "098765432", "15/12/2009")

    println(persona)
}



