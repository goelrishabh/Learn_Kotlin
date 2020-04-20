package pkg_kotlin


val s = "I am a String"
//val s = 9

fun main() {

//    if (s is String) {
//        val temp = s as String
//        println(temp.toUpperCase())
//    }

    // OR

//    if (s is String) {
//        // Smart Cast
//        println(s.toUpperCase())
//    }

    // OR

//    println((s as? String)!!.toUpperCase()) // Do not use !! it throws NPE

    println((s as? String)?.toUpperCase() ?: "Integer Type")


}

