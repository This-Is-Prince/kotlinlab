fun main(args: Array<String>) {
    var x = 5
    val y = 3.0


//    val result = x + y
//
//    println("Result is $result")

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    var result = x + y

    result += 2
    println("Result $result")

    result -= 2
    println("Result $result")

    result *= 2
    println("Result $result")

    result /= 2
    println("Result $result")

    result %= 2
    println("Result $result")

    x = 0

    println("x = ${x++}")
    println("x = ${++x}")

    val isActive = false

    if (isActive) {
        println("I'm active")
    } else {
        println("I'm inactive")
    }

    val myNumber = 100
    if (myNumber > 150) {
        println("Number is greater than 150")
    } else if (myNumber > 90) {
        println("Number is greater than 90")
    } else {
        println("Number is less than 90")
    }

    if (myNumber >= 100) {
        println("Number is greater than or equal to 100")
    } else {
        println("Number is less than 100")
    }

    if (myNumber < 100) {
        println("Number is less than 100")
    } else if (myNumber === 100) {
        println("Number is equal to 100")
    } else if (myNumber != 20) {
        println("Number is not equal to 20")
    } else {
        println("Number is greater than 100")
    }

    val isPlaying = true
    val score = 80
    println("Score $score")

    if (isPlaying && score >= 81) {
        println("Yes playing and score is greater than 70")
    } else if (isPlaying && score < 70) {
        println("Yes playing and score is less than 70")
    } else if (isPlaying && (score >= 71 && score <= 80)) {
        println("Yes playing and score is greater than 70 and less than equal to 80")
    } else {
        println("No playing and score is $score")
    }


    val text = if (isPlaying) "Playing" else "Not Playing"

    val text2 =  if (isPlaying && score >= 81) {
        "Yes playing and score is greater than 70"
    } else if (isPlaying && score < 70) {
        "Yes playing and score is less than 70"
    } else if (isPlaying && (score >= 71 && score <= 80)) {
        "Yes playing and score is greater than 70 and less than equal to 80"
    } else {
        "No playing and score is $score"
    }

    println(text)
    println(text2)
}