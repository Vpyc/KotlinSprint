package `KS-3-2`

fun main() {
    val name = "Татьяна"
    var secondName = "Андреева"
    val surname = "Сергеевна"

    var age = 20

    println("[$secondName $name $surname [ERR: Data corrupted] - ███████████████, $age]")

    secondName = "Сидорова"
    age = 22

    println("[${secondName.replace("Сидорова", "[ДАННЫЕ УДАЛЕНЫ]")} " +
            "$name $surname [ERR: Data corrupted] - ██████████, ${age.toString().replace("22", "[ОШИБКА ДОСТУПА]")}" +
            " [ДАННЫЕ УТЕРЯНЫ] ]")
}
