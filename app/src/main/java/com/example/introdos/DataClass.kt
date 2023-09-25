package com.example.introdos

fun main() {

    val usuario = User("Gaston", 43)
    val usuario2 =
        usuario.copy(edad = 20) //Copiamos el mismo usuario pero solo le cambiamos la edad.
    println(usuario.toString())
    println("Son iguales: ${usuario == usuario2}")
    println(usuario.hashCode())

    val gato1 = Gato("Clyde", "2 años", 2, "KG", "Angora")
    val gato2 = Gato("Luna", "2 años", 5, "Libras", "Criollita")
    val gato3 = Gato("Mono", "1.5 años", 10, "Kilos", "De taller")
    println("Los datso del gato son: " + "\n"+
            "$gato1," + "\n" +
            "$gato2 y " + "\n" +
            "$gato3")

    println(gato1.copy(nombreG = "Hidraulico", raza = "Tibetano"))
}

data class User (val nombre: String, val edad: Int)
data class Gato (val nombreG: String, val edadG: String, val peso: Int,  val unidadMedida: String, val raza: String)