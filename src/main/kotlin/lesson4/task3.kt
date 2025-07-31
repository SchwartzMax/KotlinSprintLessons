package lesson4

const val PERCENTAGE_HUMIDITY = 20
const val UNFAVORABLE_SEASON = "winter"
const val IS_SUNNY_DAY = true
const val IS_WINDOW_OPEN = true

fun main() {
    val isSunny: Boolean = true
    val isAwningIsOpen: Boolean = true
    val airHumidity = 20
    val currentTimeOfTheYear: String = "winter"

    val conditions: Boolean =
        (isSunny == IS_SUNNY_DAY) && (isAwningIsOpen == IS_WINDOW_OPEN) && (airHumidity == PERCENTAGE_HUMIDITY) && (currentTimeOfTheYear != UNFAVORABLE_SEASON)
    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")
}