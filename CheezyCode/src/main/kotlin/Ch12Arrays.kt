fun main() {
    var arr = arrayOf("One", "Two", "Three")
    for ((i, e) in arr.withIndex()) {
        println("$i -> $e")
    }

    println(arr[0])
    println(arr.get(1))
    arr.set(0, "Hello")
    arr[2] = "Yoo"
    println(arr[2])

    println(arr.size)
//    println(arr[3])
}