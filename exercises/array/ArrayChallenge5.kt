package exercises.array

import kotlin.math.sign

/**
 * Problem Statement:
 * Given a string, find the first non-repeating character in it
 * and return its index. If it does not exist, return -1.
 */

/**
 * Example
 * Input: "leetcode"
 * Output: 0    // 'l' is the first non-repeating character
 *
 * Input: "loveleetcode"
 * Output: 2    // 'v' is the first non-repeating character
 *
 * Input: "aabb"
 * Output: -1   // no unique character
 *
 * Constraints
 *
 * - 1 ≤ s.length ≤ 10^5
 * - s consists only of lowercase English letters.
 */

fun main() {
    runTests5()
}

fun firstUniqChar(s: String): Int {
    // We will count how many times each character appears in the string.
    // Then we will iterate again to find the first non-repeating character.

    var count = IntArray(26)
    //26 is the number of letters in alphabet,
    // The array is initialized with zeros, and each index represents a letter ('a' -> 0, 'b' -> 1, ..., 'z' -> 25).

    for (char in s){
        // 'char - 'a'' calculates the index corresponding to this character.
        // We increment the count at that index to track how many times the character appears.
        count[char -'a']++
    }

    for (i in s.indices){ //s.indices = 0 until s.length
        // Check the count for each character in the string using the same index logic.
        // If the count is 1, this is the first unique character.
        if(count[s[i] - 'a'] == 1){
            return i
        }
    }

    return -1
}

fun runTests5() {
    println(firstUniqChar("leetcode"))      // 0
    println(firstUniqChar("loveleetcode"))  // 2
    println(firstUniqChar("aabb"))          // -1
    println(firstUniqChar("z"))             // 0
}
