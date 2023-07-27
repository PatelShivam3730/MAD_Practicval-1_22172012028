fun main() {
    val numberList = readNumberListFromUser(5) // Specify the number of values (5) here

    val maxNumber = numberList.maxOrNull()

    if (maxNumber != null) {
        println("The maximum number is: $maxNumber")
    } else {
        println("The list is empty.")
    }
}

fun readNumberListFromUser(count: Int): ArrayList<Int> {
    val numberList = arrayListOf<Int>()

    println("Enter $count numbers:")
    var input: String?
    var inputCount = 0

    while (inputCount < count) {
        input = readLine()
        if (input == null || input == "q") {
            println("Invalid input. Please enter a valid number.")
            continue
        }

        val number = input.toIntOrNull()
        if (number != null) {
            numberList.add(number)
            inputCount++
        } else {
            println("Invalid input. Please enter a valid number.")
        }
    }

    return numberList
}￼Enter
