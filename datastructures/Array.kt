package datastructures

/**
    An array is a collection of data that store values sequentially and provide indexed access.
    It is referenced by the variable name indexed with [].Index starts with 0
    An Array have a fixed size once created, and all elements must be of the same type
    An Array can hold repeated values
 **/

/**
 * Initialization
 */

// Empty IntArray
val emptyIntArray = intArrayOf() // size = 0

// IntArray with elements
val numbers = intArrayOf(1, 2, 3, 4)

// IntArray with size 5 (all values initialized to 0)
val fiveZeros = IntArray(5)

// When we already know the elements we want to use, we should initiate the Array with any of the arrayOf methods.
// Otherwise, when we need to initiate it programmatically, we initiate it with a lambda.
val characters = charArrayOf('A', 'B', 'C', 'D', 'E')
val charactersInitiatedByIndex = CharArray(5) { index ->
    'A' + index // generates 'A', 'B', 'C', 'D', 'E'
}

// IntArray with size 5, where each element is initialized by a lambda
val multiplesOfTwo = IntArray(5) { index -> index * 2 } // [0, 2, 4, 6, 8]

/**
 * Iterations
 */

fun printNumbers(numbers: IntArray){

    //For Loop
    for (num in numbers) {
        println(num)
    }

    //While Loop
    var i = 0
    while (i < numbers.size) {
        println(numbers[i])
        i++
    }

    //High Order Iterations
    numbers.forEach { value ->
        println(value)
    }

    numbers.forEachIndexed { index, value ->
        println("Index $index: $value")
    }
}

/**
 * Data Scructure convertions
 */

//Kotlin have built-in extension functions to convert to almost any data structure

val list = numbers.toList()
val set = numbers.toSet()
val HashSet = set.toHashSet()
