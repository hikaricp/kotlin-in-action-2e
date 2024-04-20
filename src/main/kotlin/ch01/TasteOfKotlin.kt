package ch01

data class Person(
    val name: String,
    val age: Int? = null
)

fun main() {
    val persons = listOf(
        Person("Alice", 29),
        Person("Bob"),
    )
    val oldest = persons.maxByOrNull { it.age ?: 0 }
    println("The oldest is: $oldest")
}

