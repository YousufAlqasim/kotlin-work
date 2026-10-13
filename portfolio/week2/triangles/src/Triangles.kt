// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean {
    val a = triangle.first
    val b =triangle.second
    val c =triangle.third

    return a > 0 && b > 0 && c > 0 &&
            a < b+c &&
            b < a+c &&
            c < a+b
}
fun triangleArea(triangle: Triangle): Double {
    val a = triangle.first
    val b =triangle.second
    val c = triangle.third

    val s = (a +b + c) / 2.0

    return kotlin.math.sqrt(s*(s - a)*(s - b)*(s - c))
}