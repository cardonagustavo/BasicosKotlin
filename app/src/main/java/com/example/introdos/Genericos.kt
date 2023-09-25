package com.example.introdos

//Genericos

fun main (){
    val lista = arrayOf("Gus", 28)
    val lista2 = arrayListOf(1,2,3,4,3.3)
    println(lista)
    println(lista2)

    Genericos(persona("Gus", "Cardona", "1.90", "La Estrella", 28), "Valor 2")


}
data class persona(val nombre: String, val apellido: String, val estatura: String, val direccion: String, val edad: Int)



// la convertimos en generica cuando ponemos <> y adentro ponermos una letra o numero, generalmente es la T.
class Genericos<T, R >(value: T, value2: R) {
    init {
        println("El valor es $value y $value2")
    }
}