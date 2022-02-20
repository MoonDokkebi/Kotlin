package quiz.q02



data class User(val name: String, val age: Int)

val users = listOf(
    User("Alice", 16),
    User("Bob", 10),
    User("Carol", 20),
    User("Dave", 32),
    User("Eve", 29),
    User("Frank", 21),
    User("Grace", 41)
)
fun List<User>.findUserNamesOverThisAgeDesc(age: Int): List<String> {
    val a = users.sortedByDescending { it.name }
    return a.filter { it.age >= age }.map(User::name)
}

fun main() {
    val queryAge = readlnOrNull()?.toIntOrNull()
    val result = queryAge?.let { users.findUserNamesOverThisAgeDesc(it) }
    for(i in result!!){
        println(i)
    }
}


