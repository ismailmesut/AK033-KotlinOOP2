package com.ismailmesutmujde.kotlinoop2.staticvariableandmethods

import com.ismailmesutmujde.kotlinoop2.staticvariableandmethods.Aclass

fun main() {

    val a = Aclass()
    println(a.y)

    // static değişken ve metodlara sınıf ismiyle erişebiliyoruz.
    println(Aclass.x)
    println(Aclass.method())

}