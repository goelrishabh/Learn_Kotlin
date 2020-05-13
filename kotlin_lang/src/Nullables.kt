fun main() {

    val name: String = "Rishabh Goel"

    val otherName: String? = null

    println(name.length)

    println(otherName?.length) // ? Safe call operator

    println(otherName?.length ?: 0) // ? Safe call with elvis operator

}