class UserPrimary constructor(val firstName: String = "", val lastName: String = "") {

    fun printUser() {
        println("$firstName $lastName")
    }

}