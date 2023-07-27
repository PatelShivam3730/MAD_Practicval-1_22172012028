import kotlin.random.Random

fun main() 
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    val stringArray = arrayOf("Apple", "Banana", "Orange")
    val twoDArray = Array(3) { IntArray(3) { Random.nextInt(1, 10) } 
    
    println("intArray: ${intArray.contentToString()}")
    println("stringArray: ${stringArray.contentDeepToString()}")
    println("twoDArray: ${twoDArray.contentDeepToString()}")
    println("intArray as String: ${intArray.joinToString()}
    println("Printing numbers in range:")
    for (i in 1..5) 
    {
        print("$i ")
    }
    println("\nPrinting numbers in reverse range:")
    for (i in 5 downTo 1) {
        print("$i ")
    }
    println("\nPrinting numbers in exclusive range:")
    for (i in 1 until 5) {
        print("$i ")
    }
    sortIntArrayWithoutBuiltInFunction(intArray)
    println("\nSorted intArray without using built-in function: ${intArray.contentToString()}")
    intArray.sort()
    println("Sorted intArray using built-in function: ${intArray.contentToString()}")
}

fun sortIntArrayWithoutBuiltInFunction(array: IntArray) {
    val n = array.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}
