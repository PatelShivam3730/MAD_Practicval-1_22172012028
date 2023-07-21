import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var num1: Double
    var num2: Double
    var operator: Char
    var result: Double
    print("Enter num1: ")
    num1 = scanner.nextDouble()
    print("Echoose one (+, -, *, /): ")
    operator = scanner.next()[0]

    print("Enter num2: ")
    num2 = scanner.nextDouble()

    result = when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> if (num2 != 0.0) {
            num1 / num2
        } else {
            println("Error: Cannot divide by zero.")
            return
        }
        else -> {
            println("Error: Invalid operator.")
            return
        }
    }

    println("Result: $result")
}
