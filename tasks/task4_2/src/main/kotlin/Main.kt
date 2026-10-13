// Task 4.2: use of if and ranges

fun main() {
    println("a, b, c, or d")

    val choice = readln().lowercase()

    val result = if (choice.length == 1 && choice[0] in 'a'..'d') {
        "Order accepted"
    } else {
        "Invalid choice!"
    }

    println(result)
}
