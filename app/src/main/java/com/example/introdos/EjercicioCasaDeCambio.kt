package com.example.introdos

import java.text.DecimalFormat

var TRM = 0.0
var pesosEnCaja = 0.0
var dolaresEnCaja = 0.0



fun main() {

    print("Ingresa la tasa de cambio de Dollar a Pesos: $")
    TRM = readln().toDouble()

    print("Ingresa la cantidad de Pesos en caja: $")
    pesosEnCaja = readln().toDouble()

    print("Ingresa la cantidad de Dolares en caja: $")
    dolaresEnCaja = readln().toDouble()


    controlOperaciones()
}


fun controlOperaciones() {
    print("Ingresa la cantidad de Dolares a cambiar: $")
    val dolaresACambiar = readln().toDouble()

    dolaresEnCaja += dolaresACambiar

    val pesosAEntregar = TRM * dolaresACambiar

    pesosEnCaja -= pesosAEntregar

    val formato = "#,###.00"


    println("""
        ======== Recibo =========
        Pesos a entregar: $ ${DecimalFormat(formato).format(pesosAEntregar)}
        
        Pesos en caja: $ ${DecimalFormat(formato).format(pesosEnCaja)}
        Dolares en Caja: $ ${DecimalFormat(formato).format((dolaresEnCaja))}
        
    """.trimIndent()
    )

    controlOperaciones()

}
