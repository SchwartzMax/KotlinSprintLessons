package lesson4

fun main() {
    val theWeatherToday: Boolean = true
    val theAwningIsOpen: Boolean = true
    val airHumidity = 20
    val currentTimeOfTheYear: String = "winter"

    val conditions: Boolean =
        (theWeatherToday == true) && (theAwningIsOpen == true) && (airHumidity == 20) && (currentTimeOfTheYear != "winter")
    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")
}