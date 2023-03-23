package AoC2022Day1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalorieCountingFöreKtTest {

    @Test
    fun countAllCaloriesTest() {
        val allCalories: MutableList<Int> = countAllCalories("src/test/kotlin/AoC2022Day1/InputDataTest.txt")
        assertEquals(100, allCalories[0])
        assertEquals(500, allCalories[1])
        assertNotEquals(18814, allCalories[0])
        assertNotEquals(200, allCalories[1])
    }

    @Test
    fun findMaxCaloriesTest() {
        val testList = mutableListOf(100, 500, 300, 200, 400)
        val maxCalories = findMaxCalories(testList)
        assertEquals(500, maxCalories)
        assertNotEquals(100, maxCalories)
    }

    @Test
    fun sumTopThreeElvesTest() {
        val testList = mutableListOf(100, 500, 10000, 4000, 300)
        val topThree = sumTopThreeElves(testList)
        assertEquals(14500, topThree)
        assertNotEquals(10000, topThree)
    }

}