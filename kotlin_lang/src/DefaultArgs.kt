fun main() {

    functionWithDefaultArgs()

    functionWithDefaultArgs(printSomething = Unit)

}

/**
 * A function used as a default value is evaluated at runtime,
 * so do not put an expensive operation like a file read or a large memory allocation in the function.
 * The operation is executed every time your function is called, which may slow down your program.
 * */
fun functionWithDefaultArgs(
    name: String = "",
    age: Int = 0,
    printSomething: Unit = aFunction()
): Unit {
    println("I am a functionWithDefaultArgs")
}

fun aFunction() = println("I am a Function!")