package AoC2022Day2

import java.io.File

/* Advent of code 2022 day 2
Före-lösning
 */

class rockPaperScissor1(val input: List<String>) {
    val rockScore = 1
    val paperScore = 2
    val scissorScore = 3
    val winScore = 6
    val drawScore = 3
    val lossScore = 0
    val rounds = createListOfRounds()

    fun createListOfRounds(): List<List<String>> {
        return input.map { it.split(" ") }
    }

    fun calculateTotalScore(): Int {
        var sum = 0

        rounds.forEach {
            when (it[1]) {
                "X" -> when (it[0]) {
                    "A" -> sum += rockScore + drawScore
                    "B" -> sum += rockScore + lossScore
                    "C" -> sum += rockScore + winScore
                }

                "Y" -> when (it[0]) {
                    "A" -> sum += paperScore + winScore
                    "B" -> sum += paperScore + drawScore
                    "C" -> sum += paperScore + lossScore
                }

                "Z" -> when (it[0]) {
                    "A" -> sum += scissorScore + lossScore
                    "B" -> sum += scissorScore + winScore
                    "C" -> sum += scissorScore + drawScore
                }
            }
        }
        return sum
    }

    fun totalScorePartTwo(): Int {
        val rounds = createListOfRounds()
        var sum = 0

        rounds.forEach {
            when (it[1]) {
                "X" -> when (it[0]) {
                    "A" -> sum += lossScore + scissorScore
                    "B" -> sum += lossScore + rockScore
                    "C" -> sum += lossScore + paperScore
                }

                "Y" -> when (it[0]) {
                    "A" -> sum += drawScore + rockScore
                    "B" -> sum += drawScore + paperScore
                    "C" -> sum += drawScore + scissorScore
                }

                "Z" -> when (it[0]) {
                    "A" -> sum += winScore + paperScore
                    "B" -> sum += winScore + scissorScore
                    "C" -> sum += winScore + rockScore
                }
            }
        }
        return sum
    }
}
fun main() {
    val input = File("src/main/kotlin/AoC2022Day2/InputData.txt").readLines()
    val rps = rockPaperScissor1(input)
    println("Total score part one: " + rps.calculateTotalScore())
    println("Total score part two: " + rps.totalScorePartTwo())
}