package Fundamentos

fun main() {

    dizOi("Kawan", 28)

}

fun retornaNome(): String {
    return "Kawan"
}

fun dizOi(nome: String, idade: Int) {
    println("Oi ${nome}, parabéns pelos seus ${idade} anos.")
}