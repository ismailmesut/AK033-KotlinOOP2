package com.ismailmesutmujde.kotlinoop2.interface2

fun main() {

    val lion = Lion()
    val amasyaApple : Apple = AmasyaApple()
    val apple = Apple()
    val chicken : Eatable = Chicken()

    val objects = arrayOf(lion, amasyaApple, apple, chicken)

    for (obj in objects){
        if (obj is Eatable) {
            obj.howToEat()
        }
        if (obj is Squeezable) {
            obj.howToSqueeze()
        }
    }
}