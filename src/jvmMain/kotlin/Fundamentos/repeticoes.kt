package Fundamentos

fun main() {
    printa1a10()
    printa10a1()
    printaPar1a10()
    printaRang(1, 29)
    whileMenorQue10()

}

fun whileMenorQue10() {
    var x = 1
    while(x <= 10) {
        println(x)
        x++
    }
}

fun printa1a10() {

    for(numero in 1 .. 10){
        println(numero)

    }

}

fun printa10a1() {

    for(numero in 10 downTo 1) {
        println(numero)

    }
}

fun printaPar1a10() {
    for(numero in 1 .. 10 step 2)
        println(numero)
}

fun printaRang(inicio: Int, fim: Int) {
    for(numero in inicio .. fim)
        println(numero)
}