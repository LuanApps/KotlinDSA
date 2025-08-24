package exercises.array

/**
 * Problem Statement:
 * Given an array of integers (not necessarily sorted), find the length of the longest sequence of consecutive numbers.
 *
 * The numbers do not need to be in order.
 *
 * You must return only the length of the sequence, not the sequence itself.
 */

/**
 * Example
 * Input: [100, 4, 200, 1, 3, 2]
 * Output: 4   // because the sequence [1, 2, 3, 4] is the longest
 *
 * Constraints
 *
 * Array size: up to 10⁵ elements.
 *
 * Integers can be positive or negative.
 *
 * Time efficiency matters (try to avoid O(n²)).
 */

fun main(){
  runTests()
}

fun FindLongestSequenceOfConsecutives(numbers: IntArray): IntArray{
    if (numbers.isEmpty()) return intArrayOf()

    val orderedList = numbers.toList().distinct().sorted()

    var longest = mutableListOf(orderedList[0])
    var current = mutableListOf(orderedList[0])

    for (i in 1 until orderedList.size){
        val value = orderedList[i]
        if (value == current.last() + 1){
            current.add(value)
        }
        else{
            current = mutableListOf(value)
        }
        if (current.size > longest.size){
            longest = current.toMutableList()
        }
    }

    return longest.toIntArray()
}

fun runTests() {
    val tests = listOf(
        intArrayOf(100, 4, 200, 1, 3, 2) to intArrayOf(1, 2, 3, 4),
        intArrayOf(9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6) to intArrayOf(3, 4, 5, 6, 7, 8, 9),
        intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1) to intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8),
        intArrayOf(1, 2, 0, 1) to intArrayOf(0, 1, 2),
        intArrayOf(10, 30, 20) to intArrayOf(10)
    )

    for ((index, test) in tests.withIndex()) {
        val (input, expected) = test
        val result = FindLongestSequenceOfConsecutives(input)
        println("Test ${index + 1}: input=${input.toList()} result=${result.toList()} expected=${expected.toList()}")
    }
}