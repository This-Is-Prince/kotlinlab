fun main() {
    var count = 5

    while (count >= 1) {
        println(count)
        count--
    }

    println()

    var number = 2
    var index = 1
    while (index <= 10) {
        println(number * index)
        index++
    }

    println("Outside loop - " + index)

    var index2 = 5
    do {
        println("Hello")
        index2++
    } while (index2 > 5)
}