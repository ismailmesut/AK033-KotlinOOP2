package com.ismailmesutmujde.kotlinoop2.inheritance2

fun main() {

    val topkapiPalace = Palace(20,5)
    val bogazVilla = Villa(4,true)

    println(topkapiPalace.numberOfWindows)
    println(topkapiPalace.numberOfTowers)

    println(bogazVilla.numberOfWindows)
    println(bogazVilla.isThereGarage)

}