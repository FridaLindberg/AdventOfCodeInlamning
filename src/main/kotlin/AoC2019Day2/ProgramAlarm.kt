package AoC2019Day2

import java.io.File

/* Advent of code 2019 day 2
Före-lösning
 */

class IntcodeComputer(val input: String) {

    val code = inputToList()

    fun inputToList() = input.split(',').map { it.toInt() }

    fun intcode(code: List<Int>): MutableList<Int> {
        val mutableCode = code.toMutableList()

        var i = 0
        var end = false

        while (!end) {
            when (mutableCode[i]) {
                1 -> mutableCode[mutableCode[i + 3]] = mutableCode[mutableCode[i + 1]] + mutableCode[mutableCode[i + 2]]
                2 -> mutableCode[mutableCode[i + 3]] = mutableCode[mutableCode[i + 1]] * mutableCode[mutableCode[i + 2]]
                99 -> end = true
            }
            i += 4
        }
        return mutableCode
    }

    fun findPair(output: Int): MutableList<Int> {

        val pair: MutableList<Int> = mutableListOf()

        for(n in 0..99) {
            for(m in 0..99) {
                val mutableCode = code.toMutableList()
                mutableCode[1] = n
                mutableCode[2] = m
                if(intcode(mutableCode)[0]==output){
                    pair.add(n)
                    pair.add(m)
                }
            }
    }
    return pair
    }

} fun main() {
    val input = File("src/main/kotlin/AoC2019Day2/InputData.txt").readText()
    val computer = IntcodeComputer(input)
    computer.inputToList()
    val resetCode = computer.code.toMutableList()
    resetCode[1] = 12
    resetCode[2] = 2
    val finalState = computer.intcode(resetCode)
    println(finalState[0])
    val pair = computer.findPair(19690720)
    println("Noun = ${pair[0]}, Verb = ${pair[1]}")
    val answer = 100 * pair[0] + pair[1]
    println("100 * noun + verb = $answer")
}