package pkg_kotlin

/**
 * Do check the Lecture notes on coursera for this Topic
 * */


//val s: String = null // Not Allowed

val s1: String? = null // Allowed

fun main() {

//    println(s1.length) // Not Allowed

    println(s1?.length) // Allowed

//    println(s1.length ?: 0) // Not Allowed

    /**
     * Elvis Operator ?:
     * */
    println(s1?.length ?: 0) // Allowed

    if (s1 == null) return
    // Smart Cast no need to use ? operator to derefrence as already checked above
    println(s1.length)

}