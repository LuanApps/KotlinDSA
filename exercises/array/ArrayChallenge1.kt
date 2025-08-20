package exercises.array

/**
 * Return the max value of a given array of integers
 */

fun main(){
    val input = intArrayOf(3, 5, 9, 7, 10)
    val result = maxNumberInArray(input)
    println(result)
}

fun maxNumberInArray(numbers: IntArray): Int{
    /**
     * easiest solution
     */
    //return numbers.max()

    /**
     * Using for loop
     */
    var highestValue = numbers[0]

    for (num in numbers) {
        if (num > highestValue) {
            highestValue = num
        }
    }
    return highestValue
}