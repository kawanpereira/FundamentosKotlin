package Fundamentos

data class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Classe: Pessoa. Nome: ${nome}, idade: ${idade}"
    }
}

fun main() {
    var Kawan = Pessoa("Kawan", 24)
    println(Kawan)
}