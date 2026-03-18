fun main() {
    val number = 10
    val result = number in 1 until 10

    println(result)


    val animal = "Dog"

    if (animal == "Horse") {
        println("Animal is Horse")
    } else if (animal == "Cat") {
        println("Animal is Cat")
    } else if (animal == "Dog") {
        println("Animal is Dog")
    } else {
        println("Animal Not Found")
    }


    when (animal) {
        "Horse" -> println("Horse")
        "Cat" -> println("Cat")
        "Dog" -> println("Dog")
        else -> println("Animal Not Found")
    }


    val result2 = when (animal) {
        "Horse" -> "Horse"
        "Cat" -> "Cat"
        "Dog" -> "Dog"
        else -> "Animal Not Found"
    }
    println(result2)
}