package AoC2019Day2

import java.io.File

/* Advent of code 2019 day 2
Efter-lösning
Inspirerat av https://todd.ginsberg.com/post/advent-of-code/2019/day2/
 */

class IntcodeComputerEfter(val input: String) {

    val code = inputToList()

    fun inputToList() = input.split(',').map { it.toInt() }

    fun intcode(code: List<Int>, noun: Int, verb: Int): MutableList<Int> {
        val mutableCode = code.toMutableList()
        mutableCode[1] = noun
        mutableCode[2] = verb

        (mutableCode.indices step 4).forEach { i ->
            when (mutableCode[i]) {
                1 -> mutableCode[mutableCode[i + 3]] = mutableCode[mutableCode[i + 1]] + mutableCode[mutableCode[i + 2]]
                2 -> mutableCode[mutableCode[i + 3]] = mutableCode[mutableCode[i + 1]] * mutableCode[mutableCode[i + 2]]
                99 -> return mutableCode
            }
        }
        throw IllegalStateException("Something went wrong with the program")
    }

    fun findPair(output: Int): MutableList<Int> {

        val pair: MutableList<Int> = mutableListOf()

        for(noun in 0..99) {
            for(verb in 0..99) {
                if(intcode(code, noun, verb)[0]==output){
                    pair.add(noun)
                    pair.add(verb)
                }
            }
        }
        return pair
    }
}
fun main() {
    val input = File("src/main/kotlin/AoC2019Day2/InputData.txt").readText()
    val computer = IntcodeComputerEfter(input)
    computer.inputToList()
    val finalState = computer.intcode(computer.code, 12, 2)
    println(finalState[0])
    val pair = computer.findPair(19690720)
    println("Noun = ${pair[0]}, Verb = ${pair[1]}")
    val answer = 100 * pair[0] + pair[1]
    println("100 * noun + verb = $answer")
}
