package lesson3

fun main() {
    val hourStart = 9
    val minuteStart = 39
    val OnTheWay = 457

    var hourFinish = hourStart + (OnTheWay / 60)
    var minuteFinish = minuteStart + (minuteStart % 60)

    println("Время прибытия ${hourFinish+1}:${minuteFinish-60}")
}