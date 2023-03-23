package AoC2022Day1

import java.io.File

/* Advent of code 2022 day 1
Efter-lösning
Inspirerat av https://medium.com/@inzuael/advent-of-code-2022-using-kotlin-3fec4c0b23c6
 */

fun createCaloriesList(input: List<String>) : MutableList<Int> {
    val listCalories: MutableList<Int> = mutableListOf()
    var calories = 0
    input.forEach{
        if (it.isNotBlank()) {
            calories += it.toInt()
        } else {
            listCalories.add(calories)
            calories = 0
        }
    }
    return listCalories
}

fun findMaxCalories2(lista : MutableList<Int>) = lista.max()

fun sumTopThreeElves2(lista : MutableList<Int>) = lista.sortedDescending().take(3).sum()

fun main() {
    val input = File("src/main/kotlin/AoC2022Day1/InputData.txt").readLines()
    val listOfCalories = createCaloriesList(input)
    println(findMaxCalories2(listOfCalories))
    println(sumTopThreeElves2(listOfCalories))
}
