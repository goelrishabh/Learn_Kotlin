package pkg_kotlin

fun main() {

    var i = 0
    while (i <= 9) {
        print(++i)
    }

    println("")

    i = 0;
    do {
        print(++i)
    } while (i <= 9)

    println("")

    i = 0;

    for (i in 0..9) {
        print(i)
    }

    println("")

    for (i in 0 until 9) {
        print(i)
    }

    println("")

    for (i in 0 until 9 step 2) {
        print(i)
    }

    println("")

    for (i in 9 downTo 0) {
        print(i)
    }

    println("")

    val aMap = mapOf(
        1 to "one",
        2 to "two",
        3 to "three"
    )

    for ((key, value) in aMap) {
        println("$key = $value")
    }

    val aList = listOf(
        "A",
        "B",
        "C"
    )

    for ((index, element) in aList.withIndex()) {
        println("$element at $index")
    }

    aList.forEachIndexed { i, s -> println("$i, $s") }


}