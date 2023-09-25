package com.example.introdos

import android.bluetooth.BluetoothA2dp
import java.util.Locale

fun main() {
    val a = 5
    val b = 2
    var max = a
    if (a < b) max = b
    println(max)


    val a2 = 7
    val b2 = 5
    var max2: Int
    max2 = if (a2 > b2){
        a2
    }else{
        b2
    }
    println(max2)


    var mutableList = mutableListOf<String>("Gustavo", "Steban", "Diego", "leo", "Andres")
    mutableList.add("David")
    mutableList.removeAt(3)
    mutableList.equals("gus" == "Gustavo")

    for (nombre in mutableList){
        println(nombre)
    }

    for ((index, values) in mutableList.withIndex()){
        println("nombre: $values con indice: $index")
    }
    println(mutableList)

    var listInmutable = listOf<String>("Carro", "Moto", "Avion", "Tren")
    listInmutable.forEach {elementos ->
        println(elementos)

    }

    listInmutable.forEachIndexed { index, elemento ->
        println("Elemento: $elemento con indice: $index")
    }

    val x = 5
    when (x){
        1 -> { println("X es 1") }
        2 -> { println("x es 2") }
        3 -> { println("x es 3") }
        else -> { println("X no corresponde a ninguna funcion declarada") }
    }

    val y = 10
    when (y) {
        1 -> { println("1 es Blue") }
        3 -> { println("2 es Black") }
        4 -> { println("3 es Yellow") }
        2 -> { println("4 es White") }
        5 -> { println("5 es Purple") }
        6 -> { println("6 es Red") }
        7 -> { println("7 es Pink") }
        8 -> { println("8 es Grey") }
        9 -> { println("9 es Green") }
        10 -> { println("10 es Orange") }
        else -> { println("The color is incorrect") }
    }
/////////////////////////////////////
    var i = 1
    while (i <= 5 ){
        println("Valor $i")
        ++i
    }
 ////////////////////////////////
    var suma = 0
    var input: String
    do {
        print("Ingresar un numero:")
        input = readLine()!!
        suma += input.toInt()
    }while (input != "0" )

    println("suma = $suma")


    ////////////////////////////
// Una funcion extension es una funcion que se le palica a una clase de cierto tipo y se cambia el valor al valor que la funcion entrega
    val nombre = "Gustavo"
   println (nombre.toLowerCase())


    val numero = 10
    println(numero.toString())


    println("Remover primer caracter: ${nombre.removerPrimerCaracter()}")

}

fun String.removerPrimerCaracter(): String = this.substring(1,this.length - 1)
