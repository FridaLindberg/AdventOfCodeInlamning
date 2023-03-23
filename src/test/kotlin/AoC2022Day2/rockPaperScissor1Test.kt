package AoC2022Day2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.File

internal class rockPaperScissor1Test {

    val testInput = File("src/test/kotlin/AoC2022Day2/InputDataTest.txt").readLines()
    val rps = rockPaperScissor1(testInput)

    @Test
    fun createListOfRoundsTest() {
        val rounds = rps.createListOfRounds()
        assertEquals("A", rounds[0][0])
        assertEquals("C", rounds[1][0])
        assertNotEquals("C", rounds[0][0])
    }

    @Test
    fun calculateTotalScoreTest() {
        val score = rps.calculateTotalScore()
        assertEquals(46, score)
        assertNotEquals(100, score)
    }

    @Test
    fun totalScorePartTwoTest() {
        val score = rps.totalScorePartTwo()
        assertEquals(52, score)
    }
}
