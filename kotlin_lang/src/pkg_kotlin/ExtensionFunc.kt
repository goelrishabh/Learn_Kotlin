package pkg_kotlin

//fun main() {
//
//    infix fun Int.addNo(no: Int): Int = this + no // Local extension function
//
//    val aInt: Int = 2;
//
//    println(aInt.addNo(5))
//    // or
//    println(aInt addNo 5)
//
//}

/**
 *
 * Extension functions are just static functions of Java under the Hood
 * We can't overide the memeber functions of a class and if we try to do so
 * then warning will be thrown and MEMBER FUNC ALWAYS WINS
 *
 */
fun String.get(aInt: Int): Char = '#' // Will Not Work, Member func overides it!

fun String.get(): Char = '#'

fun main() {

    val aString: String = "abcd"

    println(aString.get(0))

    println(aString.get())

}
