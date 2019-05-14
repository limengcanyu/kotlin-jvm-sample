package com.kotlin.jvm.sample.specialClasses

/**
 * <p>Description: Sealed Classes </p>
 *
 * Sealed classes let you restrict the use of inheritance. Once you declare a class sealed, nobody else can create its subclasses.
 *
 * @author Rock Jiang
 * @date 2019/5/14 0014
 * @version 1.0
 */
sealed class Mammal(val name: String)                                                   // 1

class Cat(val catName: String) : Mammal(catName)                                        // 2
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {                                                                     // 3
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"    // 4
        is Cat -> return "Hello ${mammal.name}"                                         // 5
    }                                                                                   // 6
}

fun main() {
    println(greetMammal(Cat("Snowy")))
}

// 1. Defines a sealed class.
// 2. Defines subclasses. Note that all subclasses must be in the same file.
// 3. Uses an instance of the sealed class as an argument in a when expression.
// 4. A smartcast is performed, casting Mammal to Human.
// 5. A smartcast is performed, casting Mammal to Cat.
// 6. The else-case is not necessary here since all possible subclasses of the sealed class are covered.
//    With a non-sealed superclass else would be required.