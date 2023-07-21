import java.util.*

object FactorialCalculator {
    fun factorial(number: Long): Long {
        return if (number <= 0) {
            1
        } else {
            number * factorial(number - 1)
        }
    }
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        print("Enter no: ")
        val userInput = scanner.nextLong()
        if (userInput >= 0) {
            val result = factorial(userInput)
            System.out.printf("%d = %d%n", userInput, result)
        } else {
            println("Error: Please enter a non-negative integer.")
        }
    }
}
