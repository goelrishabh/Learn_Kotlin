package pkg_kotlin

private val v1 = mutableListOf("A", "B", "C")
private var v2 = listOf("A", "B", "C")

fun main() {

    v1.add("D")
    println(v1)

    println(v2)


}