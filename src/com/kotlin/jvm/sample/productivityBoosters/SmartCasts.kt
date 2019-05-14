package com.kotlin.jvm.sample.productivityBoosters

/**
 * <p>Description: Smart Casts 智能转换 </p>
 *
 * The Kotlin compiler is smart enough to perform type casts automatically in most cases,
 * including: 1. Casts from nullable types to their non-nullable counterparts. 2. Casts from a supertype to a subtype.
 *
 * @author Rock Jiang
 * @date 2019/5/14 0014
 * @version 1.0
 */
import java.time.LocalDate
import java.time.chrono.ChronoLocalDate

fun main() {
    val date: ChronoLocalDate? = LocalDate.now()    // 1

    if (date != null) {
        println(date.isLeapYear)                    // 2
    }

    if (date != null && date.isLeapYear) {          // 3
        println("It's a leap year!")
    }

    if (date == null || !date.isLeapYear) {         // 4
        println("There's no Feb 29 this year...")
    }

    if (date is LocalDate) {
        val month = date.monthValue                 // 5
        println(month)
    }
}

// 1. Declares a nullable variable.
// 2. Smart-cast to non-nullable (thus allowing direct access to isLeapYear).
// 3. Smart-cast inside a condition (this is possible because, like Java, Kotlin uses short-circuiting).
// 4. Smart-cast inside a condition (also enabled by short-circuiting).
// 5. Smart-cast to the subtype LocalDate.

// This way, you can automatically use variables as desired in most cases without doing obvious casts manually.