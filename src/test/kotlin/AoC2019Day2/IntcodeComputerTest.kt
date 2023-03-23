package AoC2019Day2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

internal class IntcodeComputerTest {

    val testInput = File("src/test/kotlin/AoC2019Day2/InputDataTest.txt").readText()
    val computer = IntcodeComputer(testInput)
    val testCode = computer.inputToList().toMutableList()

    @Test
    fun inputToListTest() {
        val list = computer.inputToList()
        assertEquals(1, list[0])
        assertEquals(99, list[8])
        assertNotEquals(0, list[0])
    }

    @Test
    fun intcodeTest() {
        val finalState = computer.intcode(testCode)
        assertEquals(2, finalState[0])
        assertEquals(1, finalState[4])

    }

    @Test
    fun findPairTest() {
        val input = File("src/main/kotlin/AoC2019Day2/InputData.txt").readText()
        val realComputer = IntcodeComputer(input)
        val pair = realComputer.findPair(19690720)
        assertEquals(2, pair.size)
    }
}
