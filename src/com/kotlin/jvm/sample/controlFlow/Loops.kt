package com.kotlin.jvm.sample.controlFlow

/**
 * <p>Description: Loops </p>
 *
 * Kotlin supports all the commonly used loops: for, while, do-while
 *
 * @author Rock Jiang
 * @date 2019/5/14 0014
 * @version 1.0
 */

/**
 * <p>Description: for </p>
 *
 * for in Kotlin works the same way as in most languages.
 *
 */
fun main(args: Array<String>) {
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {                               // 1
        println("Yummy, it's a $cake cake!")
    }

}

// 1. Loops through each cake in the list.

/**
 * <p>Description: while and do-while </p>
 *
 * while and do-while constructs work similarly to most languages as well.
 *
 */
//fun eatACake() = println("Eat a Cake")
//fun bakeACake() = println("Bake a Cake")
//
//fun main(args: Array<String>) {
//    var cakesEaten = 0
//    var cakesBaked = 0
//
//    while (cakesEaten < 5) {                    // 1
//        eatACake()
//        cakesEaten ++
//    }
//
//    do {                                        // 2
//        bakeACake()
//        cakesBaked++
//    } while (cakesBaked < cakesEaten)
//
//}

// 1. Executes the block while the condition is true.
// 2. Executes the block first and then checking the condition.

/**
 * <p>Description: Iterators </p>
 *
 * You can define your own iterators in your classes by implementing the iterator operator in them.
 *
 */
//class Animal(val name: String)
//
//class Zoo(val animals: List<Animal>) {
//
//    operator fun iterator(): Iterator<Animal> {             // 1
//        return animals.iterator()                           // 2
//    }
//}
//
//fun main() {
//
//    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
//
//    for (animal in zoo) {                                   // 3
//        println("Watch out, it's a ${animal.name}")
//    }
//
//}

// 1. Defines an iterator in a class. It must be named iterator and have the operator modifier.
// 2. Returns the iterator that meets the following method requirements:
//    next(): Animal
//    hasNext(): Boolean
// 3. Loops through animals in the zoo with the user-defined iterator.

// The iterator can be declared in the type or as an extension function.