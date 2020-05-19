class InitBlock constructor(val firstName: String = "", val lastName: String = "") {

    // Called just after the invocation of Primary Constructor
    init {
        println("First init block")
    }

    // Multiple init are called depending upon on their order starting from TOP
    init {
        println("Second init block")
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