package com.example.happybirthday

fun main() {
    convertTemperature(100.0, "Celsius", "Fahrenheit")
    convertTemperature(373.15, "Kelvin", "Celsius")
    convertTemperature(32.0, "Fahrenheit", "Kelvin")
}

fun convertTemperature(initialMeasurement: Double, initialUnit: String, finalUnit: String) {
    when {
        initialUnit == "Celsius" && finalUnit == "Fahrenheit" -> {
            printFinalTemperature(initialMeasurement, initialUnit, finalUnit) {
                (9.0 / 5.0) * it + 32
            }
        }
        initialUnit == "Kelvin" && finalUnit == "Celsius" -> {
            printFinalTemperature(initialMeasurement, initialUnit, finalUnit) {
                it - 273.15
            }
        }
        initialUnit == "Fahrenheit" && finalUnit == "Kelvin" -> {
            printFinalTemperature(initialMeasurement, initialUnit, finalUnit) {
                (5.0 / 9.0) * (it - 32) + 273.15
            }
        }
        else -> {
            println("Conversion from $initialUnit to $finalUnit is not supported.")
        }
    }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}