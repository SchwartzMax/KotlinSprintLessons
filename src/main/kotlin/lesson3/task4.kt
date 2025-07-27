package lesson3

fun main() {
    var aMoveFromWhere = " "
    var goingWhere = " "
    var strokeNumber = " "

    aMoveFromWhere = "E2"
    goingWhere = "E3"
    strokeNumber = "2"

    println("Ход Черных $aMoveFromWhere на $goingWhere; $strokeNumber")

    aMoveFromWhere = "D2"
    goingWhere = "D3"
    strokeNumber = "3"

    println("Ход Белых $aMoveFromWhere на $goingWhere; $strokeNumber")
}