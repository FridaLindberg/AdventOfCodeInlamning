package AoC2018Day1

import java.io.File

/* Advent of code 2018 day 1
Före-lösning
 */

class Frequency(val input: List<String>) {

    fun resultingFrequency() = input.sumOf{it.toInt() }

    fun reachTwice(): Int {
        val frequencies = mutableListOf(0)
        val inputInt = input.map { it.toInt() }

        while(true)
        for(i in 0 until inputInt.size) {
            val result = frequencies.last()+inputInt[i]
            if (frequencies.contains(result)){
                return result
            }
            else frequencies.add(result)
        }
    }

}
fun main() {
    val input = File("src/main/kotlin/AoC2018Day1/InputData.txt").readLines()
    val f = Frequency(input)
    println(f.resultingFrequency())
    println(f.reachTwice())
}