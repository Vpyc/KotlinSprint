package `KS-2-1`

fun main() {
    val studentsMarks = floatArrayOf(3f,4f,3f,5f)
    val countOfStudents = studentsMarks.size.toFloat()

    var sumOfMarks = 0f
    for (mark in studentsMarks) {
        sumOfMarks += mark
    }

    val averageGrade = sumOfMarks / countOfStudents

    println(averageGrade)
}