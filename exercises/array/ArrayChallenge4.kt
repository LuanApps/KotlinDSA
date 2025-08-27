package exercises.array

/**
 * Problem Statement:
 * Given an array of strings, group the strings that are anagrams of each other.
 *
 * Two words are anagrams if they contain the same characters in the same frequency,
 * but possibly in a different order.
 *
 * You must return a list of groups, where each group is an array of anagrams.
 */

/**
 * Example
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * Output: [
 *   ["eat", "tea", "ate"],
 *   ["tan", "nat"],
 *   ["bat"]
 * ]
 *
 * Constraints
 *
 * - Array size: up to 10⁴ strings.
 * - Each string length: up to 100.
 * - Strings contain only lowercase English letters.
 * - The order of groups does not matter.
 */

fun main() {
    runTests4()
}

fun groupAnagrams(strs: Array<String>): List<List<String>>{
    if(strs.isEmpty()) return emptyList()

    val map = mutableMapOf<String, MutableList<String>>()

    for (word in strs){
        val key = word.toCharArray().sorted().joinToString("")
        map.computeIfAbsent(key){ mutableListOf() }.add(word)
    }

    return map.values.toList()
}

fun runTests4() {
    val input1 = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    val output1 = groupAnagrams(input1)
    println("Test 1: $output1")

    val input2 = arrayOf("")
    val output2 = groupAnagrams(input2)
    println("Test 2: $output2")

    val input3 = arrayOf("a")
    val output3 = groupAnagrams(input3)
    println("Test 3: $output3")

    val input4 = arrayOf("ab", "ba", "abc", "cab", "bca", "xy")
    val output4 = groupAnagrams(input4)
    println("Test 4: $output4")
}
