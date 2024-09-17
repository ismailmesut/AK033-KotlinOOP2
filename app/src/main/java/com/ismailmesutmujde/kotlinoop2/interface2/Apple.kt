package com.ismailmesutmujde.kotlinoop2.interface2

open class Apple : Eatable, Squeezable {
    override fun howToEat() {
        println("Slice and eat")
    }

    override fun howToSqueeze() {
        println("Squeeze with blender")
    }
}