fun main() {

}

open class Phone {
    val name: String = ""
    val type: String = ""
    val volume: Int = 10

    fun makeCall() {}
    fun display() {}
    fun powerOff() {}
    fun getDeviceInfo() {}
}

class BasicPhone: Phone() {
    fun getScreenInfo() {}
}

class SmartPhone: Phone() {
    fun playMovie() {}
    fun takePicture() {}
    fun getLocation() {}
}