package pkg_kotlin

fun main() {

    val aAnimal: Animal = Cat();

    /**
     * Switch with Steroids
     * */
    when (aAnimal) {
        // Smart Casting
        is Dog -> aAnimal.woof()
        is Cat -> aAnimal.meow()
    }

}

interface Animal {

}

class Dog : Animal {

    fun woof() {
        println("Woof")
    }

}

class Cat : Animal {

    fun meow() {
        println("Meow")
    }

}