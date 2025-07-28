package lesson2

const val percentages = 100
fun main() {
    val cristal = 7
    val iron = 11

    val procent: Float = 20f / percentages
    val cristalProcent = cristal * procent
    val ironProcent = iron * procent

    println("Количество бонусных кристалов: ${(cristalProcent).toInt()}")
    println("Количество бонусного металла: ${(ironProcent).toInt()}")
}