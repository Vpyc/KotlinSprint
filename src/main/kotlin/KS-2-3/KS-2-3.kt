package `KS-2-3`

const val MINUTES_DIVIDER = 60

fun main() {
    val departureHours = 9
    val departureMinutes = 39

    println("Время отправления - %02d:%02d".format(departureHours, departureMinutes))

    val travelTimeInMinutesFromServer = 457

    val travelTimeInHours = travelTimeInMinutesFromServer / MINUTES_DIVIDER
    val travelTimeInRemainingMinutes = travelTimeInMinutesFromServer % MINUTES_DIVIDER

    println("Время в пути - %02d:%02d".format(travelTimeInHours, travelTimeInRemainingMinutes))

    val sumOfMinutes = departureMinutes + travelTimeInRemainingMinutes

    val arrivalHours = if (sumOfMinutes > 60) departureHours + travelTimeInHours + 1 else departureHours + travelTimeInHours
    val arrivalMinutes = (sumOfMinutes) % MINUTES_DIVIDER

    println("Время прибытия - %02d:%02d".format(arrivalHours, arrivalMinutes))
}
