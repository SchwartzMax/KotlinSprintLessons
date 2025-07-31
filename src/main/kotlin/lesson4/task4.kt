package lesson4

fun main() {
    val traningDay = 2

    var groupTranig = (traningDay%2 == 0)
    var traningHandsPress = (groupTranig == false)
    var traningLegsBack = (groupTranig == true)

    println("""
        Упражнения для рук:    $traningHandsPress
        Упражнения для ног:    $traningLegsBack
        Упражнения для спины:  $traningLegsBack
        Упражнения для пресса: $traningHandsPress
    """.trimIndent())





}