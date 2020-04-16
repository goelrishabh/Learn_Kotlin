package pkg_kotlin

// A top level function
fun main() {

    println(sumKotlin(0))
    println(sumKotlin(aDouble = 0.00))
    println(sumKotlin(0, 0.00))
    print(sumKotlin(aDouble = 0.00, aInt = 0))

    println("I am top level function::kotlin.main")

    val foo: Foo = Foo()
    foo.memberFun()

    // https://medium.com/tompee/idiomatic-kotlin-local-functions-4421f86ac864
    fun localFunction() {
        println("I am local function")
    }

    localFunction()

}

class Foo {

    // A class level function
    fun memberFun(): Unit {
        println("I am member function")
    }

}

/**
 * Named Args <-> Overloading
 * */
//region Method Overloading
@JvmOverloads // so that java can call it otherwise have to pass all values of args; This creates some performance issue though
fun sumKotlin(aInt: Int = 0, aDouble: Double = 0.00): Double {
    return aInt + aDouble
}
//endregion
