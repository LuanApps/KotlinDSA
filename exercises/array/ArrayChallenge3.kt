package exercises.array

/**
 * Problem Statement:
 * Given an array of strings, find the longest common prefix among them.
 *
 * If there is no common prefix, return an empty string "".
 */

/**
 * Example
 * Input: ["flower", "flow", "flight"]
 * Output: "fl"
 *
 * Input: ["dog", "racecar", "car"]
 * Output: ""   // because there is no common prefix
 *
 * Constraints
 *
 * - Array size: 1 ≤ n ≤ 10⁴
 * - Each string length: 1 ≤ s.length ≤ 200
 * - Strings consist only of lowercase English letters.
 */

fun main() {
    runTests3()
}

fun longestCommonPrefix(strs: Array<String>): String {
    if(strs.size == 0)
        return ""
    var prefix = strs[0]

    for (i in 1 until strs.size){
        while (!strs[i].startsWith(prefix)){
            if(prefix.isEmpty()) return ""
            prefix = prefix.substring(0, prefix.length - 1)
        }
    }
    return prefix
}

fun runTests3() {
    val test1 = arrayOf("flower", "flow", "flight")
    println(longestCommonPrefix(test1)) // fl

    val test2 = arrayOf("dog", "racecar", "car")
    println(longestCommonPrefix(test2)) // ""

    val test3 = arrayOf("interspecies", "interstellar", "interstate")
    println(longestCommonPrefix(test3)) // "inters"

    val test4 = arrayOf("a")
    println(longestCommonPrefix(test4)) // "a"
}