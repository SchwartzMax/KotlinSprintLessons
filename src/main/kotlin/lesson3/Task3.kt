package lesson3
const val minutes: Int = 60

fun main() {
    val hourStart = 9
    val minuteStart = 39
    val onTheWay = 457


    var hourFinish = hourStart + (onTheWay /minutes)
    var minuteFinish = minuteStart + (minuteStart % minutes )

    var result1 = hourFinish+1
    var result2 = minuteFinish-minutes

    println("Время прибытия $result1:$result2")
}