package com.ismailmesutmujde.kotlinoop2.package1

open class A {

    var defaultVariable = 1
    public var publicVariable = 2
    private var privateVariable = 3
    internal var internalVariable = 4
    protected var protectedVariable = 5

    // private değişkene ancak oluşturulduğu sınıfdan erişim yapabiliriz, başka sınıfdan erişemeyiz.

    fun functionA() {
        val a = A()
        println(defaultVariable)
        println(publicVariable)
        println(privateVariable)
        println(internalVariable)
        println(protectedVariable)
    }
}