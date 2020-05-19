class UserProperty constructor(val firstName: String = "", val lastName: String = "") {

    var age: Int = 0
        get() {
            println("age is $field")
            return field
        }
        set(value) {

        }

    //Secondary Constructor
    constructor(firstName: String) : this(firstName, "unknown") {
        // Do some work if req
        println("2nd constructor")
    }

    constructor() : this("unknown", "unknown") {
        // Do some work if req
        println("3rd constructor")
    }

    fun printUser() {
        println("$firstName $lastName")
    }

}