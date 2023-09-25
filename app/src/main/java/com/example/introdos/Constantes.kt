package com.example.introdos

const val direccion  = "Cotezza"


fun main(){
    println(direccion)
    println(Constantes.direccion)
    val dia = (Dias.Lunes.numero)
    val dia2 =  (Dias.Martes.numero)
    println(dia)
    println(dia2)


    println(esPAr(3))
    println(noEsPar(5))

}

class Constantes {
    companion object {
        const val direccion = "One PlAZA"
    }
}

enum class  Dias(val numero: Int) {
    Lunes(1),
    Martes(2),
    Miercoles(3),
    Jueves(4),
    Viernes(5),
    Sabado(6),
    Domingo(7)
}

fun esPAr(numero: Int): Boolean{
    return numero % 2 == 0
}

fun noEsPar(numero2: Int): Boolean {
    return numero2 % 1 == 0
}

