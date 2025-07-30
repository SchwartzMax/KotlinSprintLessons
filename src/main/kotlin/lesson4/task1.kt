package lesson4

const val NUMBER_OF_TABLES = 13
fun main() {

    val quantityBookedToday = 9
    val quantityBookedTomorrow = 13

    val availabilityOfTablesForToday: Boolean = quantityBookedToday < NUMBER_OF_TABLES
    val availabilityOfTablesForTomorrow: Boolean = quantityBookedTomorrow < NUMBER_OF_TABLES

    println("Доступность столиков на сегодня: $availabilityOfTablesForToday")
    println("Доступность столиков на завтра: $availabilityOfTablesForTomorrow")

}