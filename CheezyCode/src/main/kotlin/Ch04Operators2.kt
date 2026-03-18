fun main() {
    val above70 = false
    val knowsProgramming = true

    // && AND
    var calledForInterview = above70 && knowsProgramming
    println(calledForInterview)

    // || OR

    calledForInterview = above70 || knowsProgramming
    println(calledForInterview)
}