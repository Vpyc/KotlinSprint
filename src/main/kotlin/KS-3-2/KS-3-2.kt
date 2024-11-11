package `KS-3-2`

fun main() {
    val name = "Татьяна"
    val youngSecondName = "Андреева"
    val surname = "Сергеевна"
    val elderSecondName = "Сидорова"

    val firstAge = 20
    val secondAge = 22

    println("[$youngSecondName $name $surname [ERR: Data corrupted] - ███████████████, $firstAge]")
    println("[${elderSecondName.replace("Сидорова", "[ДАННЫЕ УДАЛЕНЫ]")} " +
            "$name $surname [ERR: Data corrupted] - ██████████, ${secondAge.toString().replace("22", "[ОШИБКА ДОСТУПА]")}" +
            " [ДАННЫЕ УТЕРЯНЫ] ]")
}
