package `KS-2-2`

fun main() {
    val employeeCount = 50
    val internCount = 30

    println("Кол-во постоянных сотрудников: $employeeCount")
    println("Кол-во постоянных стажёров: $internCount")

    val employeeSalary = 30000
    val internSalary = 20000

    println("Зп постоянных сотрудников: $employeeSalary")
    println("Зп постоянных стажёров: $internSalary")

    val onlyEmployeePayments = employeeCount * employeeSalary

    println("Выплаты только сотрудникам: $onlyEmployeePayments")

    val totalPayments = onlyEmployeePayments + internCount * internSalary

    println("Общая сумма выплат: $totalPayments")

    val averageSalary = totalPayments / (employeeCount + internCount)

    println("Средняя зп: $averageSalary")
}
