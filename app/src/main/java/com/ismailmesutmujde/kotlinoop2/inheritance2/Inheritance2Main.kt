package com.ismailmesutmujde.kotlinoop2.inheritance2

fun main() {

    val topkapiPalace = Palace(20,5)
    val bogazVilla = Villa(4,true)

    println(topkapiPalace.numberOfWindows)
    println(topkapiPalace.numberOfTowers)

    println(bogazVilla.numberOfWindows)
    println(bogazVilla.isThereGarage)

    // Type Control

    if (topkapiPalace is Palace) {
        println("This is a palace")
    } else {
        println("This is not a palace.")
    }

    // Upcasting
    val house1 : House = Palace(10,3)

    // Downcasting
    val house2 = House(2)
    val palace = house2 as Palace

}