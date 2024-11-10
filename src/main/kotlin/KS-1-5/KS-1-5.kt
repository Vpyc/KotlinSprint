package `KS-1-5`

const val SECONDS_MINUTES_DIVIDER = 60

fun main() {

    val flightSeconds = 6480

    val hour = flightSeconds / SECONDS_MINUTES_DIVIDER / SECONDS_MINUTES_DIVIDER
    val minutes = (flightSeconds - (hour * SECONDS_MINUTES_DIVIDER * SECONDS_MINUTES_DIVIDER)) / SECONDS_MINUTES_DIVIDER
    val remainsSeconds = (flightSeconds - (hour * SECONDS_MINUTES_DIVIDER * SECONDS_MINUTES_DIVIDER)) - (minutes * SECONDS_MINUTES_DIVIDER)

    println("%02d:%02d:%02d".format(hour, minutes, remainsSeconds))
}