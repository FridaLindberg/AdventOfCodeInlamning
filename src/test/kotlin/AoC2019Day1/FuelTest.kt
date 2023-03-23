package AoC2019Day1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

internal class FuelTest {

    val testInput = File("src/test/kotlin/AoC2019Day1/InputDataTest.txt").readLines()
    val fuel = Fuel(testInput)

    @Test
    fun sumFuelTest() {
        val sum = fuel.sumFuelPartOne()
        assertEquals(2124, sum)
        assertNotEquals(1000, sum)
    }

    @Test
    fun sumFuelPartTwo() {
        val sum = fuel.sumFuelPartTwo()
        assertEquals(3127, sum)
        assertNotEquals(1000, sum)

    }
}