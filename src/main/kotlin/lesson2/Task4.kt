package lesson2

fun main() {
    val cristal = 7
    val iron = 11

    val procent:Float = 20/100f

    println("Количество бонусных кристалов: ${((cristal * procent)).toInt()}")
    println("Количество бонусного металла: ${((iron * procent)).toInt()}")
}