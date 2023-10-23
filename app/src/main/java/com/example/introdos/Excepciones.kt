package com.example.introdos

import java.io.File

fun main() {
/*
    try {
        val valor = readLine()!!.toDouble()
        println("valor")
    }catch (e: Exception) {
        println("Entrada incorrecta, valor debe ser numero")
        main()
    }

 */

    mensaje2()
    println(numero(readln()!!))
    println(calcularInteresPrestamo(readLine()!!.toDouble()))

}

fun mensaje2() {

    try {
        val numero =  readln()!!.toDouble()
        println("Correcto!")
    }catch (e: Exception) {
        println(File("C:\\Users\\gustavo.cardona\\Documents\\Mensaje.txt").readLines()[0])
    }finally {
        println("Entro al Finally")
    }

}

fun numero(valor: Any): Boolean {
    val resultado = try {
        valor.toString().toDouble()
        true
    }catch (e: Exception){
        false
    }
    return resultado
}


fun calcularInteresPrestamo (valor2: Double): Double {

    if (valor2 > 100000.00){
        throw Exception("El valor no puede ser superior a 100mil")
    }
    return valor2 * 0.20
}