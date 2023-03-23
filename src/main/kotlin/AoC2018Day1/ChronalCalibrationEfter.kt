package AoC2018Day1

import java.io.File

/* Advent of code 2018 day 1
Efter-lösning
Inspirerat av https://www.youtube.com/watch?v=9y8iCSu0KYQ och https://todd.ginsberg.com/post/advent-of-code/2018/day1/
 */

class FrequencyEfter(val input: List<String>) {

    val inputAsInt = input.map { it.toInt() }

    fun resultingFrequency() = inputAsInt.sum()

    fun reachTwice(): Int {
        val frequencies: MutableSet<Int> = mutableSetOf()
        var inputInt = input.map { it.toInt() }
        var result = 0

        while (!frequencies.contains(result)) {
            frequencies.add(result)
            if(inputInt.isEmpty()) {
                inputInt = inputAsInt
            }
            result += inputInt[0]
            inputInt = inputInt.drop(1)

    }
    return result
    }
}
fun main() {
    val input = File("src/main/kotlin/AoC2018Day1/InputData.txt").readLines()
    val f = Frequency(input)
    println(f.resultingFrequency())
    println(f.reachTwice())
}