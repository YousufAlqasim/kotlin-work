fun main() {
    print("Enter the first string: ")
    val first = readLine()!!

    print("Enter the second string: ")
    val second = readLine()!!

    println(anagrams(first, second))
}