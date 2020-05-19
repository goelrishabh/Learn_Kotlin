fun main() {

    val nestedClass = NestedClass()
    println(nestedClass.getContainerInfo())

    val aNestedClass = NestedClass.aNestedClass()
    println(aNestedClass.getNestedInfoA())

    val bNestedClass = InnerClass.bNestedClass()
    println(bNestedClass.getNestedInfoB())

}


class NestedClass {

    val name = "Container Class"

    fun getContainerInfo(): String {
        return name
    }

    // Don't have access to the Container Class Properties
    class aNestedClass {

        val name = "Nested Class a"

        fun getNestedInfoA(): String {
            return name
        }

    }

    class bNestedClass {

        val name = "Nested Class b"

        fun getNestedInfoB(): String {
            return name
        }

    }

}