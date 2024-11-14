package `KS-3-5`

fun main() {
    val request = "D2-D4;0"

    // Первый способ

    val parts = request.split(";")

    val move = parts[0]

    val turn1 = parts[1].toInt()

    val moveParts = move.split("-")

    val startPosition1 = moveParts[0]
    val finalPosition1 = moveParts[1]

    println("Стартовая позиция - $startPosition1")
    println("Конечная позиция - $finalPosition1")
    println("Ход - $turn1\n")


    // Второй способ

    val regex = """([A-H][1-8])-([A-H][1-8]);(\d+)""".toRegex()

    val matchResult = regex.find(request)

    if (matchResult != null) {
        val (startPosition2, finalPosition2, turn2) = matchResult.destructured

        println("Стартовая позиция - $startPosition2")
        println("Конечная позиция - $finalPosition2")
        println("Ход - $turn2")
    }
}