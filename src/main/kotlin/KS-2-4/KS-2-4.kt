package `KS-2-4`

const val PERCENT_DIVIDER = 100

fun main() {
    val gatheredCristalOre = 7
    val gatheredIronOre = 11

    println("Собранная без баффа кристаллическая руда: $gatheredCristalOre")
    println("Собранная без баффа железная руда: $gatheredIronOre")

    val bonusLootBuffPercent = 20

    val bonusCristalOre = gatheredCristalOre * bonusLootBuffPercent / PERCENT_DIVIDER
    val bonusIronOre = gatheredIronOre * bonusLootBuffPercent / PERCENT_DIVIDER

    println("Бонусная кристаллическая руда: $bonusCristalOre")
    println("Бонусная железная руда: $bonusIronOre")
}
