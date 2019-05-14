package com.kotlin.jvm.sample.introduction

/**
 * <p>Description: Inheritance </p>
 *
 * Kotlin fully supports the traditional object-oriented inheritance mechanism.
 *
 * @author Rock Jiang
 * @date 2019/5/14 0014
 * @version 1.0
 */
open class Dog {                // 1
    open fun sayHello() {       // 2
        println("wow wow!")
    }
}

class Yorkshire : Dog() {       // 3
    override fun sayHello() {   // 4
        println("wif wif!")
    }
}

fun main() {
    val dog: Dog =
        Yorkshire()
    dog.sayHello()
}

// 1. Kotlin classes are final by default. If you want to allow the class inheritance, mark the class with the open modifier.
// 2. Kotlin methods are also final by default. As with the classes, the open modifier allows overriding them.
// 3. A class inherits a superclass when you specify the : SuperclassName() after its name. The empty parentheses () indicate an invocation of the superclass default constructor.
// 4. Overriding methods or attributes requires the override modifier.

/**
 * <p>Description: Inheritance with Parameterized Constructor </p>
 *
 */
//open class Tiger(val origin: String) {
//    fun sayHello() {
//        println("A tiger from $origin says: grrhhh!")
//    }
//}
//
//class SiberianTiger : Tiger("Siberia")                  // 1
//
//fun main() {
//    val tiger: Tiger = SiberianTiger()
//    tiger.sayHello()
//}

// 1. If you want to use a parameterized constructor of the superclass when creating a subclass,
//    provide the constructor arguments in the subclass declaration.

/**
 * <p>Description: Passing Constructor Arguments to Superclass </p>
 *
 */
//open class Lion(val name: String, val origin: String) {
//    fun sayHello() {
//        println("$name, the lion from $origin says: graoh!")
//    }
//}
//
//class Asiatic(name: String) : Lion(name = name, origin = "India") // 1
//
//fun main() {
//    val lion: Lion =
//        Asiatic("Rufo")                              // 2
//    lion.sayHello()
//}

// 1. name in the Asiatic declaration is neither a var nor val: it's a constructor argument,
//    whose value is passed to the name property of the superclass Lion.
// 2. Creates an Asiatic instance with the name Rufo. The call invokes the Lion constructor with arguments Rufo and India.