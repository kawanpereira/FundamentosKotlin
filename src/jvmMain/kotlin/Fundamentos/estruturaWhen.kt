package Fundamentos

fun main() {
    val x = 5

    when(x) {
        5 -> println("x == 5")
        8 -> println("x == 8")
        10 -> {
            println(" x == 10")
            println(" x é uma dezena")
        }


        else -> ("numero não mapeado")

    }
}