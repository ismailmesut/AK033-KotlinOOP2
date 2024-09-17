package com.ismailmesutmujde.kotlinoop2.enumaration

fun main() {

    fun getFee(size: CannedSize) {
        when(size) {
            CannedSize.Small  -> println(20*30)
            CannedSize.Medium -> println(30*30)
            CannedSize.Large  -> println(40*30)
        }
    }

    getFee(CannedSize.Large)
}