fun main() {
    var car1 = Automobile("Car1", 4, 5, "Petrol", true)
    car1.airBags
    var car2 = Automobile("Car2", 4, 5, "Petrol", true)

    var car3 = Automobile("YOO", "YOO")


    var person = Person1(nameParam = "8", ageParam = 80)
    println(person.age)
    println(person.name)
}

class Automobile(val name: String, val types: Int, val maxSeating: Int, val engineType: String, hasAirBags: Boolean) {
    init {
        println("$name is created")
    }
    var airBags = hasAirBags
    init {
        println("2nd init")
    }

    constructor(nameParam: String, engineParam: String): this(nameParam, 4, 5, engineParam, true)

    fun drive() {}
    fun applyBrakes() {}
}

class Empty1{}

class Person1(nameParam: String, ageParam: Int) {
    val name: String = "$nameParam - Clan"
    var age: Int = ageParam

    var canVote: Boolean = ageParam > 18
}