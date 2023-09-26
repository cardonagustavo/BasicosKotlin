package com.example.introdos


fun main () {
    val nombre = "Gus"

    if (nombre.isNotEmpty()) {
        println("El largo de nuestra variable nombre es ${nombre.length}")
    }else{
        println("Error la variable esta vacia")
    }
//---------------------------------------------------//

    val edad = 28

    if(edad > 18) println("Puedes conducir eres mayor de edad $edad") else println("Para conducir debes ser mayor de edad $edad")

//---------------------------------------------------------//
    val colorAdivinar = "Azul"

    val color = "Azul"

    if (color == colorAdivinar) {
        println("Color Correcto: $color")
    } else if (color == "Verde") {
        println("Sigue intentando, el color correcto es $colorAdivinar")
    } else {
        println("No adivinaste el color, debe ser $colorAdivinar")
    }


//-------------------------------------------------------//

    /**
     * Este programa es una calculadora simple que permite al usuario ingresar dos números
     * y realizar operaciones de suma, resta, multiplicación o división.
     */

        // Solicitar al usuario ingresar dos números
        println("Ingrese el primer número:")
        val num1 = readLine()!!.toDouble()

        println("Ingrese el segundo número:")
        val num2 = readLine()!!.toDouble()

        // Solicitar al usuario seleccionar una operación
        println("Seleccione la operación: +, -, *, /")
        val operacion = readLine()

        // Realizar la operación seleccionada y mostrar el resultado
        if (operacion == "+") {
            println("Resultado: ${num1 + num2}")
        } else if (operacion == "-") {
            println("Resultado: ${num1 - num2}")
        } else if (operacion == "*") {
            println("Resultado: ${num1 * num2}")
        } else if (operacion == "/") {
            if (num2 != 0.0) {
                println("Resultado: ${num1 / num2}")
            } else {
                println("No se puede dividir por cero.")
            }
        } else {
            println("Operación no válida.")
        }

    //--------------------------------------------------------------//

    /**
     * Este programa es un juego simple en el que el usuario debe adivinar un número aleatorio
     * entre 1 y 100. El programa proporciona pistas sobre si el número es demasiado alto o bajo
     * y muestra la cantidad de intentos necesarios para adivinar el número.
     */

    //Generar u numero aleatorio entre 1 y 10
    val numeroAleatorio = (1..10).random()
    var intentos = 0

    //Juego de adivinar el numero
    while (true){
        println("Adivina el numero de 1 a 10")
        val intento = readLine()!!.toInt()
        intentos++

        if (intento == numeroAleatorio) {
            println("Adivinaste el numero en $intentos intentos")
            break
        }else if (intento < numeroAleatorio) {
            println("Casi, pero te pasaste, intenta de nuevo")
        }else{
            println("Casi, pero te quedaste por debajo, intenta de nuevo")
        }

    }

    //--------------------------------------------------------------//




}


