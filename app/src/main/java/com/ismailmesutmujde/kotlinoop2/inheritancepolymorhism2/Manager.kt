package com.ismailmesutmujde.kotlinoop2.inheritancepolymorhism2

class Manager : Employee() {

    fun hire(e:Employee) {
        e.wereHired()
    }

    fun promote(e:Employee) {

        if (e is Teacher) {
            e.increaseSalary()
        }
        if (e is Worker) {
            println("Workers cannot receive promotions.")
        }
    }
}