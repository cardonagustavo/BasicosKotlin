package com.example.introdos


import com.example.introdos.Classes.Text
import java.util.Date

fun main() {

    val nota1 = Text.Nota("Diana", "Bernard","calculo")

    val nota2 = Text.Nota("Jose", "Juan", "Math")

    val nota3 = Text.Nota("Robert", "Juan", "Kotlin")
    /*
    println(nota1.nombre)
    println(nota1.contenido)
    println(nota1.fechaCreacion)

    nota1.nombre = "Nota actualizada"

    println(nota1.nombre)
    println(nota1.contenido)
    println(nota1.fechaCreacion)

     */

    val listaNotas = arrayListOf<Text.Nota>()

    listaNotas.add(nota1)
    listaNotas.add(nota2)

    listaNotas.forEach{
        println("""
        ${it.alumno}
        ${it.maestro}
        ${it.materia}
        =========================
    """.trimIndent())
    }

    listaNotas[0].alumno = "Nombre actualizado"

    var message = "Kotlin Dev"

    println()
}




