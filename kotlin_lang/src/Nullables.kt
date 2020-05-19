fun main() {

    val name: String = "Rishabh Goel"

    val otherName: String? = null

    println(name.length)

    println(otherName?.length) // ? Safe call operator result is null

    println(otherName?.length ?: 0) // ? Safe call with elvis operator to specify result other than null

}