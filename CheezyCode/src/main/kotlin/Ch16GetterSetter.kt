fun main() {
    val ob = Calculator()
    println(ob.add(2, 3))

    val p1 = Person3("prince", 21)
    println(p1.name)
    println(p1.age)
    p1.age = 23
    p1.age = -12
}

class Person3(nameParam: String, ageParam: Int) {
    var name: String = nameParam
    get() {
        println("Name getter is called.")
        return field.uppercase()
    }
    var age: Int = ageParam

    set(value) {
        if (value > 0) {
            field = value
        } else {
            println("Age can't be negative")
        }
    }

    var email: String = ""
    get() = field
    set(value) {
        field = value
    }
}

class Calculator {
    lateinit var message: String

    fun add (a: Int, b: Int): Int {
        return a + b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }
}
