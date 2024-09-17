package com.ismailmesutmujde.kotlinoop2.composition

fun main() {
    val address = Address("Bursa","Osmangazi")
    val person = Person1("Mesut",18, address)
    println("Person name     : ${person.name}")
    println("Person age      : ${person.age}")
    println("Person province : ${person.address.province}")
    println("Person borough  : ${person.address.borough}")
}