package `KS-2-5`

import kotlin.math.pow

const val PERCENT_DIVIDER = 100

fun main() {
    val startCapital = 70_000
    val interestRate = 16.7
    val depositPeriod = 20

    val finalSum = compoundInterest(startCapital, interestRate, depositPeriod)

    println("При показателях стартового капитала в $startCapital, процентной ставки в $interestRate и срока вклада в " +
            "$depositPeriod конечная сумма будет следующей: ${String.format("%.3f",finalSum)}")
}

fun compoundInterest(startCapital: Int, interestRate: Double, depositPeriod: Int): Double {
    return startCapital * (1 + interestRate/PERCENT_DIVIDER).pow(depositPeriod)
}
