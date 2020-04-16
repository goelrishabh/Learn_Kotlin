package pkg_kotlin

private val variable: String = "Kotlin"

fun main() {

    println("Hello $variable")

    println("Hello ${variable.toUpperCase()}")

    println("Hello ${if (variable.length >= 50) variable else ""}")

}