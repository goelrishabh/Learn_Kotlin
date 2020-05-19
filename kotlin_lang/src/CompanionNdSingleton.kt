fun main() {

//    Singleton.name = "";

    println(CompanionNdSingleton.aConstant);
    val companionNdSingletonInstance = CompanionNdSingleton()
    println(companionNdSingletonInstance.aConstant);

    println(SharedConstants.aConstant)

}


class CompanionNdSingleton constructor() {

    val aConstant = "I am a Local Constant";

    // kotlin way of creating statics
    companion object {

        val aConstant = "I am a Constant!";

        fun instance() = CompanionNdSingleton()

    }

}

// kotlin way of creating Singleton
object Singleton {

    val name = ""
    //...

}

object SharedConstants {

    const val aConstant = "I am a shared constant!"

}

