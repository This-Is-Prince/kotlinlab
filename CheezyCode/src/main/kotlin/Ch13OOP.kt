fun main() {
    val mustang = Car("Mustang", "petrol", 100)
    val bettle = Car("Bettle", "diesel", 200)

    println(mustang.name)
    println(mustang.type)
    println(mustang.kmRan)

    println(bettle.name)
    println(bettle.type)
    println(bettle.kmRan)

    bettle.driveCar()
}


class Car (val name: String, val type: String, var kmRan: Int) {
    fun driveCar() {
        println("$name Car is driving")
    }

    fun applyBrakes() {
        println("Applied Brakes")
    }
}