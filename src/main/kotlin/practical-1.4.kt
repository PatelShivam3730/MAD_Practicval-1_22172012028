object OddEvenCheck {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Enter a number:")
        val input = readLine()
        if (input != null && input.isNotEmpty()) {
            val number = input.toInt()
            if (number % 2 == 0) {
                println("$number is an even number.")
            } else {
                println("$number is an odd number.")
            }
        } else {
            println("Invalid input. Please enter a valid number.")
        }
    }
}
