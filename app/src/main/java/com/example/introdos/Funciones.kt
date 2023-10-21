package com.example.introdos

import java.util.Date

/*
Una función, en programación, es un bloque de código que realiza una tarea o un conjunto de tareas específicas. Estas tareas pueden incluir cálculos, manipulación de datos, procesamiento de información, toma de decisiones y muchas otras operaciones. Las funciones se utilizan para organizar y reutilizar código de manera eficiente.

Una función generalmente toma uno o varios valores de entrada, conocidos como parámetros o argumentos, realiza acciones o cálculos basados en esos valores y puede devolver un resultado. En algunos lenguajes de programación, como Kotlin, también se pueden crear funciones sin un valor de retorno, que realizan acciones pero no generan un resultado.

En resumen, una función es una unidad fundamental de un programa de computadora que permite dividir el código en partes más pequeñas y manejables, lo que facilita la organización, la legibilidad y la reutilización del código. Las funciones desempeñan un papel crucial en la programación modular y permiten realizar tareas específicas de manera eficiente y estructurada.
 */


fun main() {

    mostrarMensaje()
    mostrarInformacion("Gus", "Cardona", "Moto", 190)
    println(calculoImpuestos(10000000.0, 15.0))
    println(calculoImpuestos2(20000000.0, 10.0))
}

fun mostrarMensaje() {
    println(
        """
            Mensaje: Aprendiendo Kotlin
            Fecha: ${Date()}
            """.trimIndent()
    )
}


fun mostrarInformacion (nombre: String, apellido: String, vehiculo: String, cilindraje: Int) {
    println("""
        Nombre: $nombre
        Apellido: $apellido
        Vehiculo: $vehiculo
        Cilindrado: $cilindraje
    """.trimIndent())

}


//Forma tradicional (larga) de escribir la funcion.
fun calculoImpuestos(salario: Double, porcentajeImpuesto: Double): Double {
    val totalImpuestos = (salario / 100) * porcentajeImpuesto

    return totalImpuestos
}

//Forma corta de escribir la funcion.
fun calculoImpuestos2(salario: Double, porcentajeImpuesto2: Double): Double {

    return (salario / 100) * porcentajeImpuesto2
}


