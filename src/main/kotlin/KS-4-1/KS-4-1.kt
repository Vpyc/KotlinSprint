package `KS-4-1`

fun main() {
    val totalSitCount = 13

    val bookedSitCountToday = 13
    val bookedSitCountTomorrow = 9

    println("Доступность столиков на сегодня: ${bookedSitCountToday < totalSitCount}" +
            "\nДоступность столиков на завтра: ${bookedSitCountTomorrow < totalSitCount}\n")
}