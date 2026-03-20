fun main() {
    val oneplus = OnePlus("SmartPhone")
    oneplus.display()

    val generalMobile = Mobile("BasicPhone")
    generalMobile.display()
}

open class Mobile(val type: String) {
    open val name: String = ""
    val size: Int = 5

    fun makeCall() = println("Calling From Mobile")
    fun powerOff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display")
}

class OnePlus(typeParam: String): Mobile(typeParam) {
    override val name: String = "OnePlus"

    override fun display() {
        super.display()
        println("One Plus Display")
    }
}