package com.ismailmesutmujde.kotlinoop2.inheritance

fun main() {

    val car = Car("Red", "Automatic", "Sedan")

    println(car.color)
    println(car.gear)
    println(car.bodyType)

    val nissan = Nissan("White", "Manual", "Sedan","Micra")
    println(nissan.color)
    println(nissan.gear)
    println(nissan.bodyType)
    println(nissan.model)
}