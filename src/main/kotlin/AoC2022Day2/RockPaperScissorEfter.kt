package AoC2022Day2

import java.io.File

/* Advent of code 2022 day 2
Efter-lösning
Inspirerat av https://github.com/ClouddJR/advent-of-code-2022/blob/main/src/main/kotlin/com/clouddjr/advent2022/Day02.kt
 */

class rockPaperScissor2(val input: List<String>) {
    val rockScore = 1
    val paperScore = 2
    val scissorScore = 3
    val winScore = 6
    val drawScore = 3
    val lossScore = 0

    fun totalScorePartOne(): Int {

        return input.sumOf {
            when (it) {
                "A X" -> rockScore + drawScore
                "A Y" -> paperScore + winScore
                "A Z" -> scissorScore + lossScore
                "B X" -> rockScore + lossScore
                "B Y" -> paperScore + drawScore
                "B Z" -> scissorScore + winScore
                "C X" -> rockScore + winScore
                "C Y" -> paperScore + lossScore
                "C Z" -> scissorScore + drawScore
                else -> 0.toInt()
            }
        }
    }

    fun totalScorePartTwo(): Int {
        return input.sumOf {
            when (it) {
                "A X" -> lossScore + scissorScore
                "A Y" -> drawScore + rockScore
                "A Z" -> winScore + paperScore
                "B X" -> lossScore + rockScore
                "B Y" -> drawScore + paperScore
                "B Z" -> winScore + scissorScore
                "C X" -> lossScore + paperScore
                "C Y" -> drawScore + scissorScore
                "C Z" -> winScore + rockScore
                else -> 0.toInt()
            }
        }
    }
}

fun main() {
    val input = File("src/main/kotlin/AoC2022Day2/InputData.txt").readLines()
    val rps = rockPaperScissor2(input)
    println("Total score part one: " + rps.totalScorePartOne())
    println("Total score part two: " + rps.totalScorePartTwo())
}


