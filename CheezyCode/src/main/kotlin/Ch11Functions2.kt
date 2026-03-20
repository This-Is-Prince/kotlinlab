fun main() {
    println(addition(a=2, b=3))
    println(addition(b=5.0, a=4.5))

    var fn: (a: Double, b: Double) -> Double = ::addition
    println(fn(1.0, 2.0))
}

fun addition(a: Int, b: Int): Int {
    return a + b
}

fun addition(a: Double, b: Double): Double {
    return a + b
}