package com.example.introdos

fun main() {
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list:   ${numbers}")
    println("sorted: ${numbers.sorted()}")

    val setOfNumbers = numbers.toSet()
    println("set:    ${setOfNumbers}")

    val set1 = setOf(1,2,3)
    val set2 = mutableSetOf(3,2,1)
    println("$set1 == $set2: ${set1 == set2}")

    println("contains 7: ${setOfNumbers.contains(7)}")

    val conjunto1 = setOf(1,2,37,4,50,6,7,87,9,0)
    val conjunto2 = setOf(3,5,6,87,2)

    val interseccion = conjunto1.intersect(conjunto2)
    println("interseccion: $interseccion")


    val union = conjunto1.union(conjunto2)
    println("union: $union")

    val conjuntoA = setOf("manzana", "plátano", "naranja")
    val conjuntoB = setOf("naranja", "uva", "pera")

    val interseccionString = conjuntoA.intersect(conjuntoB)
    val unionString = conjuntoA.union(conjuntoB)

    println("Intersección: $interseccionString")
    println("Unión: $unionString")

    val peopleAges = mutableMapOf<String, Int>(
        "Diego" to 40,
        "Master" to 33,
        "Gus" to 28
    )
    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    peopleAges["Fred"] = 31
    println(peopleAges)

    peopleAges.forEach { print("${it.key} is ${it.value}, ") }

    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", ") )

    val filteredNames = peopleAges.filter { it.key.length < 4 }
    println(filteredNames)

    peopleAges.filter { it.key.length < 4 }

    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sorted())


    println(peopleNames.sortedWith { str1: String, str2: String -> str1.length - str2.length })



    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")


    val filteredWords = words.filter { it.startsWith("c", ignoreCase = true) }
        .shuffled()  // crea una copia de la coleccion con los elementos mezclados
        .take(2)  // toma los primeros elemetos de una coleccion.
        .sorted()  // muestra una copia de la coleccion con los elementos ordenados.
    println(filteredWords)



}