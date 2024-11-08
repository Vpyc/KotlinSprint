package les5

fun main() {
    val seconds = 6480

    val hour = seconds / 60 / 60
    val minutes = (seconds - (hour * 60 * 60)) / 60
    val remainsSeconds = (seconds - (hour * 60 * 60)) - (minutes * 60)

    println("${String.format("%02d", hour)}:${String.format("%02d", minutes)}:${String.format("%02d", remainsSeconds)}")
}