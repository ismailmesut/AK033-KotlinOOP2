package com.ismailmesutmujde.kotlinoop2.composition2

fun main() {

    val c1 = Categories(1,"Drama")
    val c2 = Categories(2,"Comedy")
    val d1 = Directors(1, "Nuri Bilge Ceylan")
    val d2 = Directors(2, "Quentin Tarantino")

    val m1 = Movies(1, "Django", 2013, c1, d2)
    println("Movie id       : ${m1.movie_id}")
    println("Movie name     : ${m1.movie_name}")
    println("Movie year     : ${m1.movie_year}")
    println("Movie category : ${m1.category.category_name}")
    println("Movie director : ${m1.director.director_name}")

}