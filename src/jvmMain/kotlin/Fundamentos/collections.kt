package Fundamentos

fun main() {
    var lista = listOf(1, 2, 3)
    val pares = lista.filter { it % 2 == 0 }

    println(pares)
}