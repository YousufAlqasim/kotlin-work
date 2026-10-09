// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: Please provide three temperature values.")
        return
    }

    val initialTemp = args[0].toFloat()
    val maxTemp = args[1].toFloat()
    val increment = args[2].toFloat()

    var currentTemp = initialTemp

    println("%10s %15s".format("Celsius (°C)", "Fahrenheit (°F)"))

    while (currentTemp <= maxTemp) {
        val fahrenheit = currentTemp * 9 / 5 + 32

        println("%10.1f %15.1f".format(currentTemp, fahrenheit))

        currentTemp += increment
    }
}
