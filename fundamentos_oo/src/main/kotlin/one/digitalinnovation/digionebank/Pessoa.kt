package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Everson"
    var cpf: String = "123.456.789-10"
    private set

    constructor()

    fun pessoaInfo() = "Nome: $nome e CPF: $cpf"

}

fun main(){
    val everson = Pessoa()
    println(everson.pessoaInfo())
}