package AoC2019Day1

import java.io.File

/* Advent of code 2019 day 1
Efter-lösning
Inspirerat av https://todd.ginsberg.com/post/advent-of-code/2019/day1/
 */

class FuelAfter(val input: List<String>) {

    fun Int.calcFuel() = this / 3 - 2

    fun sumFuelPartOne(): Int {
        return input.sumOf{it.toInt().calcFuel()}
    }

    fun sumFuelPartTwo(): Int {
        fun accumulator(acc: Int, mass: Int) : Int {
            val newMass = mass.calcFuel()
            return if(newMass<=0) acc
            else accumulator(acc+newMass, newMass)
        }
        return input.sumOf{accumulator(0, it.toInt())}
    }
}

fun main() {
    val input = File("src/main/kotlin/AoC2019Day1/InputData.txt").readLines()
    val fuel = FuelAfter(input)
    println("Sum part one: " + fuel.sumFuelPartOne())
    println("Sum part two: " + fuel.sumFuelPartTwo())
}