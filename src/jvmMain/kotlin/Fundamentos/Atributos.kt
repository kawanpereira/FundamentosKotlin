package Fundamentos

data class Carro(var cor: String, val anoFabricacao: Int){


}

fun main() {
    var carro = Carro("Branco", 2021)

    println(carro)
}