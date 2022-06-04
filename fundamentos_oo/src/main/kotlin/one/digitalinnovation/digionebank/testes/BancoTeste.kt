package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiBanco = Banco("DigiOne", 13)

    println(digiBanco)

    val banco2 = digiBanco.copy(nome = "Banco2")

    println(banco2.info())
}