fun main() {

    val myImmutableName = "Rishabh Goel" // immutable
    var myMutableName = "Rishabh Goel"
    myMutableName = "another Rishabh"

    // To get the type which they belong to!
    println(myImmutableName::class)
    println(myImmutableName::class.java)


    // Number Types i.e -> All below inherits from Number Class
    val myByte: Byte = 8 // 8-bit storage
    val myShort: Short = 16 // 16-bit storage
    val myInt: Int = 32
    val myLong: Long = 64
    val myFloat: Float = 32.5f // 32-bit storage
    val myDouble: Double = 43.120233 // 64-bit storage


    var veryLong: Long = 10000000000
    // OR
    veryLong = 10_000_000_000 // Syntactic Sugar and nice readability!


    val aString: String = "I am a String"

    val aChar: Char = 'A'

}