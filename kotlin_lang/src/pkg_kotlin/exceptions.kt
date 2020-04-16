package pkg_kotlin

import java.lang.NumberFormatException

fun main() {

    val aString = "Hello"
    castToNo(aString)

}

@Throws(NumberFormatException::class) // To call from Java
fun castToNo(aString: String) {
    try {
        Integer.parseInt(aString)
    } catch (e: NumberFormatException) {
        throw NumberFormatException("Can't parse to no $aString")
    }
}