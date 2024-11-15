package `KS-3-1`

fun main() {
    val dayGreetings = "Добрый день"
    val eveningGreetings = "Добрый вечер"
    val name = "Марнеус Калгар"
    val regalia = """
        Верховный Лорд Ультрамара, Примарх-проксимо Гильмена, Великий Воевода Тетрархов Ультрамара,
        Мастер Клинка Ультрамаринов, Мастер Орбиса, Кулак Гильмена, Носитель Паноплии Героев, Воевода Тиранидных Войн,
        Победитель в Битве за Макрагг, Лорд-Командующий Имперского Сегментума Ультима, Глашатай Западного Крестового Похода,
        Иконоборец Кадабес, Защитник Восточных Рубежей, Носитель Чести Легиона XIII, Лорд Протекторат Империи
        Громовержец Макрагга, Покровитель Оставшихся, Лидер Вечного Бдения,
        Оруженосец Первого Клинка и Праведный Возмездитель Чужаков, Икона Веры и Чести в Галактике Императора
    """.trimIndent()

    var greetings = "$dayGreetings, $name, $regalia!"
    println(greetings)

    greetings = "\n$eveningGreetings, $name, $regalia!"
    println(greetings)
}
