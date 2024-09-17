package com.ismailmesutmujde.kotlinoop2.interface1

class ClassA : Interface1 {
    override val variable: Int = 10

    override fun method1() {
        println("Interface Hello")
    }

    override fun method2(): String {
        return "Interface Example"
    }
}