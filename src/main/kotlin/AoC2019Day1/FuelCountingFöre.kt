package AoC2019Day1

import java.io.File

/* Advent of code 2019 day 1
Före-lösning
 */

class Fuel(val input: List<String>) {

    fun sumFuelPartOne(): Int {
        return input.sumOf{it.toInt()/3-2}
    }

    //Rekursiv funktion som beräknar bränslet som behövs för alla modules och även för det adderade bränslet
    fun sumFuelPartTwo(): Int {

        fun accumulator(acc: Int, mass: Int) : Int {
            val newMass = mass/3-2
            return if(newMass<=0) acc
            else accumulator(acc+newMass, newMass)
        }
        return input.sumOf{accumulator(0, it.toInt())}
    }
}

fun main() {
    val input = File("src/main/kotlin/AoC2019Day1/InputData.txt").readLines()
    val fuel = Fuel(input)
    println("Sum part one: " + fuel.sumFuelPartOne())
    println("Sum part two: " + fuel.sumFuelPartTwo())
}