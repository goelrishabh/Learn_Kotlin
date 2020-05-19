fun main() {

    val innerClass = InnerClass()
    println(innerClass.getContainerInfo())

    val aInnerClass = innerClass.aInnerClass()
    println(aInnerClass.getInnerInfoA())

    val bNestedClass = InnerClass.bNestedClass()
    println(bNestedClass.getNestedInfoB())

}


class InnerClass {

    val name = "Container Class"

    fun getContainerInfo(): String {
        return name
    }

    inner class aInnerClass {

        val name = "Nested Class a"

        fun getInnerInfoA(): String {
            return name + getContainerInfo() // has access
        }

    }

    class bNestedClass {

        val name = "Nested Class b"

        fun getNestedInfoB(): String {
            return name
//            + getContainerInfo() // Nested Class Don't have access to the Container Class Properties
        }

    }

}