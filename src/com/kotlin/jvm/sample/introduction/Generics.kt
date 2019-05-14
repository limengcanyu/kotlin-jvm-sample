package com.kotlin.jvm.sample.introduction

/**
 * <p>Description: Generics </p>
 *
 * Generics are a genericity mechanism that's become standard in modern languages.
 * Generic classes and functions increase code reusability by encapsulating common logic that is independent of a particular generic type,
 * like the logic inside a List<T> is independent of what T is.
 *
 * @author Rock Jiang
 * @date 2019/5/14 0014
 * @version 1.0
 */

/**
 * <p>Description: Generic Classes </p>
 *
 * The first way to use generics in Kotlin is creating generic classes.
 *
 */
class MutableStack<E>(vararg items: E) {              // 1

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)        // 2

    fun peek(): E = elements.last()                     // 3

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun main() {
    val stack = MutableStack(0.62, 3.14, 2.7)
    stack.push(9.87)
    println(stack)

    println("peek(): ${stack.peek()}")
    println(stack)

    for (i in 1..stack.size()) {
        println("pop(): ${stack.pop()}")
        println(stack)
    }
}

// 1. Defines a generic class MutableStack<E> where E is called the generic type parameter.
//    At use-site, it is assigned to a specific type such as Int by declaring a MutableStack<Int>.
// 2. Inside the generic class, E can be used as a parameter like any other type.
// 3. You can also use E as a return type.

// Note that the implementation makes heavy use of Kotlin's shorthand syntax for functions that can be defined in a single expression.

/**
 * <p>Description: Generic Functions </p>
 *
 * You can also generify functions if their logic is independent of a specific type.
 * For instance, you can write a utility function to create mutable stacks:
 *
 */
//class MutableStack<E>(vararg items: E) {              // 1
//
//    private val elements = items.toMutableList()
//
//    fun push(element: E) = elements.add(element)        // 2
//
//    fun peek(): E = elements.last()                     // 3
//
//    fun pop(): E = elements.removeAt(elements.size - 1)
//
//    fun isEmpty() = elements.isEmpty()
//
//    fun size() = elements.size
//
//    override fun toString() = "MutableStack(${elements.joinToString()})"
//}
//
//fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)
//
//fun main() {
//    val stack = mutableStackOf(0.62, 3.14, 2.7)
//    println(stack)
//}

// Note that the compiler can infer the generic type from the parameters of mutableStackOf so that you don't have to write mutableStackOf<Int>(...).