package com.example.introdos

import com.example.introdos.Classes.Nota

fun main() {

    val nota1 = Nota()
    nota1.nombre = "prueba 1"
    nota1.contenido = "Contenido de prueba"

    val nota2 = Nota()
    nota1.nombre = "prueba 2"
    nota1.contenido = "Contenido de prueba"

    /*
    println(nota1.nombre)
    println(nota1.contenido)
    println(nota1.fechaCreacion)

    nota1.nombre = "Nota actualizada"

    println(nota1.nombre)
    println(nota1.contenido)
    println(nota1.fechaCreacion)

     */

    val listaNotas = arrayListOf<Nota>()

    listaNotas.add(nota1)
    listaNotas.add(nota2)

    listaNotas.forEach{
        println("""
        ${it.nombre}
        ${it.contenido}
        ${it.fechaCreacion}
        =========================
    """.trimIndent())
    }
}


