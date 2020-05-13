fun main() {

    val par = """
        Hello Dear,
        This is a simple paragraph, showing
        how
                cool
                        the
                                kotlin
                                        is!
    """.trimIndent()

    println(par + " Yeah it is!")
    // OR
    println("$par Yeah it is!")

}