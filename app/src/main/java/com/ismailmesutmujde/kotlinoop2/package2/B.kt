package com.ismailmesutmujde.kotlinoop2.package2

import com.ismailmesutmujde.kotlinoop2.package1.A

class B : A() {

    fun functionB() {
        val a = A()
        println(defaultVariable)
        println(publicVariable)
        //println(privateVariable)
        println(internalVariable)
        println(protectedVariable)
    }
}