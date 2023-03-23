package AoC2019Day1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.File

internal class FuelAfterTest {

    val testInput = File("src/test/kotlin/AoC2019Day1/InputDataTest.txt").readLines()
    val fuel = FuelAfter(testInput)

    @Test
    fun sumFuelPartOneTest() {
        val sum = fuel.sumFuelPartOne()
        assertEquals(2124, sum)
        assertNotEquals(1000, sum)
    }

    @Test
    fun sumFuelPartTwoTest() {
        val sum = fuel.sumFuelPartTwo()
        assertEquals(3127, sum)
        assertNotEquals(1000, sum)
    }
}