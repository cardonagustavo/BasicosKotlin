package com.example.introdos

fun main () {
    val a = 15
    val b = 30
    val c = 50

    println(a.plus(c))
    println(b.minus(a))
    println(c.times(b))
    println(b.div(a))
    println(a.rem(c))
    println(b.inc())
    println(c.dec())
    println(c.compareTo(a))
    println(a.compareTo(b)>1)
    println(c.compareTo(a)<100)
    println(a.equals(b))
    println(c==a)


}