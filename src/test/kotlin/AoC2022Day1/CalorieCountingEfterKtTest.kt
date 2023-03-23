package AoC2022Day1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

internal class CalorieCountingEfterKtTest {

    @Test
    fun createCaloriesListTest() {
        val testInput = File("src/test/kotlin/AoC2022Day1/InputDataTest.txt").readLines()
        val listCalories = createCaloriesList(testInput)
        assertEquals(100, listCalories[0])
        assertEquals(500, listCalories[1])
        assertNotEquals(200, listCalories[1])
    }

    @Test
    fun findMaxCalories2Test() {
        val testList = mutableListOf(100, 500, 300, 200, 400)
        val maxCalories = findMaxCalories(testList)
        assertEquals(500, maxCalories)
        assertNotEquals(100, maxCalories)
    }

    @Test
    fun sumTopThreeElves2Test() {
        val testList = mutableListOf(100, 500, 10000, 4000, 300)
        val topThree = sumTopThreeElves(testList)
        assertEquals(14500, topThree)
        assertNotEquals(10000, topThree)
    }
}