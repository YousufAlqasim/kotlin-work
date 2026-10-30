fun median(numbers: List<Float>): Float {
    require(numbers.isNotEmpty()) {
        "Cannot calculate median of an empty list"
    }

    val sortedNumbers = numbers.sorted()
    val middle = sortedNumbers.size / 2

    return if (sortedNumbers.size % 2 == 1) {
        sortedNumbers[middle]
    } else {
        (sortedNumbers[middle - 1] + sortedNumbers[middle]) / 2f
    }
}