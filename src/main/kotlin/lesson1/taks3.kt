package org.example.lesson1

fun main() {
    val year = 1961
    var hour = 9
    var minute = 7

    print("Год полета - ${year.toString()} ")
    print("Час - 0${hour.toString()} ")
    println("минуты - 0${minute.toString()} ")

    hour = 10
    minute = 55

    println("Посадка - $hour:$minute")

}