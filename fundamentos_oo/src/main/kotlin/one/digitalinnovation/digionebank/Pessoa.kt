package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Everson"
    var cpf: String = "123.456.789-10"

}

fun main(){
    val everson = Pessoa()

    println(everson.nome)
    println(everson.cpf)

}