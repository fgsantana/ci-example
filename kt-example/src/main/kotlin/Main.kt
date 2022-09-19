import java.util.Random

fun main() {
    println("CI/CD!")
    printRandomNumber()
}

fun printRandomNumber() {
    while (true) {
        Thread.sleep(3 * 1000L)
        val randomNumber = Random().nextInt(10)
        println("Printing random number: $randomNumber")
    }
}

fun testValue(): Int = 123
