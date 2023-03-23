package AoC2022Day1

import java.io.File
import java.util.Scanner

/* Advent of code 2022 day 1 A and B
Före-lösning */

fun countAllCalories(fileName: String) : MutableList<Int> {
    val scanner = Scanner(File(fileName))
    val listCalories: MutableList<Int> = mutableListOf()
    var calories = 0
    while (scanner.hasNext()) {
        val line = scanner.nextLine()
        if (line.isNotEmpty()) {
            calories += line.toInt()
        } else {
            listCalories.add(calories)
            calories = 0
        }
    }
    return listCalories
}

fun findMaxCalories(lista : MutableList<Int>) = lista.max()

fun sumTopThreeElves(lista : MutableList<Int>) = lista.sortedDescending().take(3).sum()


fun main() {
    val allElvesCalories = countAllCalories("src/main/kotlin/AoC2022Day1/InputData.txt")
    println("Most calories carried by an elf: " + findMaxCalories(allElvesCalories))
    println("Calories carried by top three elves: " + sumTopThreeElves(allElvesCalories))
}