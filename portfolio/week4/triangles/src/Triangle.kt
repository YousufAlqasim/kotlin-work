// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

typealias TriangleSides = Triple<Double,Double,Double>

class Triangle(
    val sideA: Double,
    val sideB: Double,
    val sideC: Double
) {
    init {
        require(isValidTriangle(TriangleSides(sideA, sideB, sideC))) {
            "Invalid triangle"
        }
    }

    val perimeter: Double
        get() = sideA + sideB + sideC

    val semiPerimeter: Double
        get() = perimeter / 2.0

    val area: Double
        get() {
            val s = semiPerimeter
            return sqrt(s*(s - sideA)*(s - sideB)*(s - sideC))
        }

    override fun toString(): String {
        return "Triangle($sideA, $sideB, $sideC)"
    }
}

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: TriangleSides): Boolean {
    val a = triangle.first
    val b =triangle.second
    val c =triangle.third

    return a > 0 && b > 0 && c > 0 &&
            a < b+c &&
            b < a+c &&
            c < a+b
}

fun triangleArea(triangle: TriangleSides): Double {
    require(isValidTriangle(triangle)) {
        "Invalid triangle"
    }
    val a = triangle.first
    val b =triangle.second
    val c = triangle.third

    val s = (a +b + c) / 2.0

    return sqrt(s*(s - a)*(s - b)*(s - c))
}