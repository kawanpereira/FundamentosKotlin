package Fundamentos

class MinhaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    companion object {
        fun criaClasse(): MinhaClasse {
            return MinhaClasse("kawan","Rua Teste",28)
        }
    }

}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    fun criaClasse(): SegundaClasse {
        return SegundaClasse("kawan","Rua Teste",28)
    }
}

fun main() {
    var SegundaClasse = SegundaClasse("kawan","Rua Teste",28).criaClasse()

    var MinhaClasse = MinhaClasse.criaClasse()

}