fun main() {
    val result = add(4, 5)
    println(result)

    printMessage(2)
    println()
    printMessage()
}

fun printMessage(count: Int = 3) {
    for (i in 1..count) {
        println("Hello $i")
    }
}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun eventOrOdd(num1: Int) {
    val result = if(num1 % 2 == 0) "Even" else "Odd"

    println(result)
}

fun add2(num1: Int, num2: Int) = num1 + num2