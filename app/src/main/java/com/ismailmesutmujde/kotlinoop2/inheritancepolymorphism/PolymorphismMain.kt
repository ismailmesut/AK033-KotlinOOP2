package com.ismailmesutmujde.kotlinoop2.inheritancepolymorphism

import com.ismailmesutmujde.kotlinoop2.inheritanceoverride.Animal
import com.ismailmesutmujde.kotlinoop2.inheritanceoverride.Cat
import com.ismailmesutmujde.kotlinoop2.inheritanceoverride.Dog

fun main() {

    val animal1 : Animal = Dog()
    animal1.makeVoice()

    val animal2 : Animal = Cat()
    animal2.makeVoice()
}