fun main(args: Array<String>) {
    var name = "Alex"
    val age: Int = 22

    println("Name is $name and age is $age")
    println("Hello World!")

    var number: Long = 22

    val maxIntegerValue: Int = Int.MAX_VALUE
    val minIntegerValue: Int = Int.MIN_VALUE

    println("Int maximum value is: $maxIntegerValue")
    println("Int minimum value is: $minIntegerValue")

    number = 2147483648
    println("Number is $number")

    val myMaxByteValue = Byte.MAX_VALUE
    val myMinByteValue = Byte.MIN_VALUE

    println("Byte maximum value is: $myMaxByteValue")
    println("Byte minimum value is: $myMinByteValue")


    val myMaxShortValue = Short.MAX_VALUE
    val myMinShortValue = Short.MIN_VALUE

    println("Short maximum value is: $myMaxShortValue")
    println("Short minimum value is: $myMinShortValue")

    val myMaxLongValue = Long.MAX_VALUE
    val myMinLongValue = Long.MIN_VALUE

    println("Long maximum value is: $myMaxLongValue")
    println("Long minimum value is: $myMinLongValue")

    val myNumber = 28L
}