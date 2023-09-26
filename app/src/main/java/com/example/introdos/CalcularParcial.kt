package com.example.introdos

/*
Solicitaremos al usuario que ingese losresultados de un quiz y determinaremos
la calificacion correspondiente a la puntuacion
 */
fun main() {

    // Solicitar al usuario ingresar la nota del quiz
    println("Ingresa la nota del quiz:")
    val nota = readLine()!!.toFloat()

    // Validar que la nota esté en el rango correcto
    if (nota in 0.0..5.0) {
        // Calificación según nota
        if (nota.toDouble() == 5.0) {
            println("Pasaste el quiz sobradamente")
        } else if (nota >= 4.0) {
            println("Pasaste el curso con una muy buena nota")
        } else if (nota >= 3.5) {
            println("Pasaste el curso con una nota buena")
        } else if (nota >= 3.0) {
            println("Pasaste el curso con una nota aceptable")
        } else {
            println("No aprobaste el quiz, estudia más para el siguiente.")
        }
    } else {
        println("Error: La nota debe estar en el rango de 0.0 a 5.0")
    }
}
