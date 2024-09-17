package com.ismailmesutmujde.kotlinoop2.inheritanceoverride

class Dog : Mammal() {
    override fun makeVoice() {
        println("Woof Woof")
    }
}