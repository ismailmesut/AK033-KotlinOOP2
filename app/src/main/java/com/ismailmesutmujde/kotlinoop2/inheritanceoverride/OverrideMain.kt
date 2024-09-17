package com.ismailmesutmujde.kotlinoop2.inheritanceoverride

fun main() {

    val animal = Animal()
    animal.makeVoice()
    // Üst sınıf doğal olarak kendi metodunu çalıştırır.

    val mammal = Mammal()
    mammal.makeVoice()
    // Alt sınıf üst sınıfın metodunu override etmesede üst sınıfın metodunu çalıştırır.

    val cat = Cat()
    cat.makeVoice()
    // Alt sınıf üst sınıfın metodunu override ettiyse kendi sınıfının metodunu çalıştırır.

    val dog = Dog()
    dog.makeVoice()
    // Alt sınıf üst sınıfın metodunu override ettiyse kendi sınıfının metodunu çalıştırır.
}