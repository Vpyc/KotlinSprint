package `KS-1-5`

fun main() {
    val secondsMinutesDivider = 60
    val flightSeconds = 6480

    val hour = flightSeconds / secondsMinutesDivider / secondsMinutesDivider
    val minutes = (flightSeconds - (hour * secondsMinutesDivider * secondsMinutesDivider)) / secondsMinutesDivider
    val remainsSeconds = (flightSeconds - (hour * secondsMinutesDivider * secondsMinutesDivider)) - (minutes * secondsMinutesDivider)

    println("%02d:%02d:%02d".format(hour, minutes, remainsSeconds))
}