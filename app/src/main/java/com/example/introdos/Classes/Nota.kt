package com.example.introdos.Classes

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.introdos.R
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

class Text (var dato: String, var nombre: String, var contenido: String ) {

    fun imprimirTotalCaracteresTexto1() {
        println(
            """
         ======== Texto ===============
         ${dato.length}
         ${nombre.length}
         ${contenido.length}
     """.trimIndent()
        )

    }

    class  Nota(var alumno: String, var maestro: String, var materia: String) {
        fun imprimirCaracteresTexto2() {
            println("""
            ======= U ==========
            ${alumno.length}
            ${maestro.length}
            ${materia.length}
        """.trimIndent())

        }

    }

    class  Auto(var marca: String, var modelo: String, var precio: Int) {
        fun imprimirCaracteriticasAuto() {
            println("""
                ======= Automovil ==========
                ${marca.length}
                ${modelo.length}
                ${precio.toFloat()}              
            """.trimIndent())
        }
    }


    class Persona(
        var name2: String, lastName2: String, addres2: String, numberCelphone2: String, var dateBorn2: String
    ) {
        @RequiresApi(Build.VERSION_CODES.O)
        var dateBornDate: LocalDate = LocalDate.parse(dateBorn2, DateTimeFormatter.ofPattern("dd/mm/yyyy"))
    }


}




