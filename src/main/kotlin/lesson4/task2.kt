package lesson4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val VOLUMES = 100

fun main() {
    val cargoWeight1 = 20
    val cargoVolumes1 = 80

    val cargoWeight2 = 50
    val cargoVolumes2 = 100

    println("Груз-1: Average: ${(MIN_WEIGHT < cargoWeight1 && MAX_WEIGHT >= cargoWeight1) && (cargoVolumes1 < VOLUMES)}")
    println("Груз-2: Average: ${(MIN_WEIGHT < cargoWeight2 && MAX_WEIGHT >= cargoWeight2) && (cargoVolumes2 < VOLUMES)}")
}