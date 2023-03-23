package AoC2022Day2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

internal class rockPaperScissor2Test {

    val testInput = File("src/test/kotlin/AoC2022Day2/InputDataTest.txt").readLines()
    val rps = rockPaperScissor1(testInput)

    @Test
    fun totalScorePartOneTest() {
        val score = rps.calculateTotalScore()
        assertEquals(46, score)
        assertNotEquals(100, score)
    }

    @Test
    fun totalScorePartTwoTest() {
        val score = rps.totalScorePartTwo()
        assertEquals(52, score)
        assertNotEquals(30, score)
    }
}