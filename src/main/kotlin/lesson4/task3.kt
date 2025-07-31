package lesson4

const val PERCENTAGE_HUMIDITY = 20
const val SEASON = "winter"
const val SUNNY_DAY = true
const val OPEN_WINDOW = true


fun main() {
    val isSunny: Boolean = true
    val isAwningIsOpen: Boolean = true
    val airHumidity = 20
    val currentTimeOfTheYear: String = "winter"

    val conditions: Boolean =
        (isSunny == SUNNY_DAY) && (isAwningIsOpen == OPEN_WINDOW) && (airHumidity == PERCENTAGE_HUMIDITY) && (currentTimeOfTheYear != SEASON)
    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")
}