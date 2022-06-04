package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Everson"

    var cpf: String = "123.456.789-10"
    private set

}

fun main(){
    val everson = Pessoa()
    everson.cpf = "126"

    println(everson.nome)
    println(everson.cpf)


}