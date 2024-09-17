package com.ismailmesutmujde.kotlinoop2.inheritancepolymorhism2

fun main() {
    val teacher : Employee = Teacher()
    val worker : Employee = Worker()

    val manager = Manager()

    //manager.hire(teacher)
    //manager.hire(worker)

    manager.promote(teacher)
    manager.promote(worker)
}