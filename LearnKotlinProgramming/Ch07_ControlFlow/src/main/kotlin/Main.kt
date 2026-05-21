fun main(args: Array<String>) {
    println("Hello World!")

    var alarm = 12

    when (alarm) {
        7 -> println("Alarm is at 7AM")
        12 -> println("Alarm is at 12AM")
        22 -> println("Alarm is at 10PM")
        else -> println("We dn't know about alarm")
    }

    println("\n\n")

    alarm = 2
    when (alarm) {
        12, 7, 14 -> println("Alarm is either 12, 7 or 14")
        in 1..10 -> println("Alarm is in between 1 and 10")
        else -> println("We dn't know about alarm")
    }

    println("\n\n")

    val text = when {
        alarm == 12 -> "Yooo 12"
        alarm >= 7 -> "Sevennnnn"
        alarm < 2 -> "LEssssyyy"
        alarm >= 2 -> "Twoooo 222"
        else -> "We dn't know about alarm"
    }
}