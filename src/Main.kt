fun main() {
    println("                ===================================Generic_Studios Presents,===================================")
    println("====================A Perfectly Ordinary calculator, Yup, Nothing at all unusual about this here Calculator====================")
    println("====================        In Fact, I Doubt You Could Find A More Normal Calculator Than This One!        ====================")
    println("                ===============================================================================================")

    var operator:String = "1"

    val num_one = get_number("Input a number: ")
    while (true) {
        print("enter an operator (+,-,*,/): ")
        val operator = readLine()
        println(operator)
        if (operator == "+") {
            println(operator)
            break
        }
        if (operator == "-") {
            println(operator)
            break
        }
        if (operator == "*") {
            println(operator)
            break
        }
        if (operator == "/") {
            println(operator)
            break
        }
        else {
            continue
        }

    }

    val num_two = get_number("Input another number: ")

    val result = when (operator) {
        "+" -> num_one + num_two
        "-" -> num_one - num_two
        "*" -> num_one * num_two
        "/" -> num_one / num_two
        else -> {0}
    }
    println("The answer is ${result}!")

}

fun get_number(prompt: String): Int{
    var user_input: Int?
    while (true) {
        print(prompt)
        user_input = readln().toIntOrNull()
        if (user_input == null) {
            continue
        }
        else {
            return user_input
        }
    }
}