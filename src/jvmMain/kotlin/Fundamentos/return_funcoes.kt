package Fundamentos

import java.sql.DriverManager.println

fun retornaNumeroPorExtenso(numero: Int): String {
    if(numero == 5) {
        return "Cinco"
    } else if(numero == 6) {
        return "Seis"
    }
    return "Inválido"

}

fun main() {
    println(retornaNumeroPorExtenso(5))
}