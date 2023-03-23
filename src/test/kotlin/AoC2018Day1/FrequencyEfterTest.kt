package AoC2018Day1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

internal class FrequencyEfterTest {

    val testInput = File("src/test/kotlin/AoC2018Day1/InputDataTest.txt").readLines()
    val f = Frequency(testInput)

    @Test
    fun resultingFrequency() {
        assertEquals(4, f.resultingFrequency())
        assertNotEquals(10, f.resultingFrequency())
    }

    @Test
    fun reachTwice() {
        assertEquals(10, f.reachTwice())
        assertNotEquals(5, f.reachTwice())
    }
}