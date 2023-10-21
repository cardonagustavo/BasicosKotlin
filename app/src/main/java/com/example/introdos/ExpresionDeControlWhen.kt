package com.example.introdos

import java.util.Locale

/*
Este pequeño ejercicio nos permite convertir una temperatura
 */
/*
fun main () {
    //El usuario ingresa la temperatura
    println("Convertir temperatura Celsius a Fahrenheit o Fahrenheit a Celsius")
    println("Ingresa la temperatura a convertir")

    val temperatura = readLine()!!.toDouble()

    println("Ingrese la unidad de medida de temperatura (C o F)")
    val unidad = readLine()?.trim()?.toLowerCase()

    val resultado = when (unidad) {
        1.toString() -> "c" {
            val fahrenheit = (temperatura * 9 / 5) + 32

        "$temperatura grados Celcius son $fahrenheit grados Fahrenheit"
    }
        2.toString() -> "f" {
        val celcius = (temperatura - 32) * 9 / 5
        "$temperatura grados Fahrenheit son $celcius grados Celcius."

    }

        else -> "Unidad de temperatura no valida"
    }

    println(resultado)
}
*/