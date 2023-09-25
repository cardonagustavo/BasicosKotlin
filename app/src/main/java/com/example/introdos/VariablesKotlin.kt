package com.example.introdos

fun main () {

    //sintaxis Java
    //Int a = 2;
    //Int b = 3;
    //Int c = a + b;

    // Kotlin Sintaxis

        var a : Int = 2
        var b : Int = 3
        var c : Int = a + b
    println(c)

    val personaUno: PersonaUno = PersonaUno("Jose", "Cardona")
    personaUno.darBienvenida2()

    val persona: Persona = Persona("Gus", "Cardona")
    val persona2  = Persona("Cris", "B")
    val persona3 = Persona()
    persona3.nombre = "Elizabeth"
    persona3.apellido = "H"
    persona.darBienvenida()

    val automovil: Automovil = Automovil( "BMW",5000000 )
    automovil.datosAutomovil()

    val pasaje: Metro = Metro("Viajero frecuente", 3000)
    pasaje.valorPasaje()

    val valorCombustible: Combustible = Combustible(13000,9000,5000)
    valorCombustible.precioCombustible()

    val moto: Moto = Moto("Honda", "1000", 2023, "15-12-2023")
    moto.selectMoto()

    val Celular: celular = celular("Xiaomi", "Redmi Note 13", 3000000)
    Celular.celular()

    val Computador: Computador = Computador("Dell", "q7", "20GB", 2, 9000000)
    Computador.pedirComputador()

}

//Vemos como con var prodemos crear variables mutables.
class Persona (var nombre: String = "", var apellido: String = ""){
    fun darBienvenida(){
        println("Bienvenido $nombre $apellido")
    }
}


// Generamos un modificador de acceso privado asi los valores dentro de la classe solo seran accesibles a estos dentro de la clese.
// Creamos un constructor vacio
class PersonaUno (private var nombreP: String = "",private  var apellidoP: String = ""){
    fun darBienvenida2(){
        println("Bienvenido $nombreP $apellidoP")
    }
}

class Automovil (val marca: String, val precio: Int) {
    fun datosAutomovil() {
        println("La marca es $marca, y el precio de $precio" )
    }
}

class Metro (val pasaje: String, val precio: Int) {
    fun valorPasaje() {
        println("El $pasaje tiene un costo de $precio")
    }
}

class Combustible (val gasolina: Int, val diesel: Int, val ACPM: Int){
    fun precioCombustible() {
        println("El precio de los combustibes esta:  Gasolina hoy $gasolina, diesel hoy $diesel, ACPM hoy $ACPM ")
    }
}

class Moto(val marca: String, val cilindraje: String, val modelo: Int, val fechaCompra: String) {
    fun selectMoto () {
        println("La moto seleccionada es de cilindraje $cilindraje marca $marca modelo $modelo y la fecha de compra fue $fechaCompra ")
    }
}

class celular(val marca: String, val referencia: String, val precio: Int ) {
    fun celular(){
        println("Este celular es de marca $marca y de referencia $referencia con un precio de $precio")
    }
}

class Computador(val Marca: String, val Modelo: String, val RAM: String, val Almacenamiento: Int, val precio: Int ) {
    fun pedirComputador() {
       println("Este modelo de computador de la marca $Marca y $Modelo con una memoria RAM $RAM y un almacenamiento de $Almacenamiento por un preciode $precio")
    }
}
