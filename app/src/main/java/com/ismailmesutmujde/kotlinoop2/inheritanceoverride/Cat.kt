package com.ismailmesutmujde.kotlinoop2.inheritanceoverride

class Cat : Mammal() {
    override fun makeVoice() {
        println("Meow Meow")
    }
}