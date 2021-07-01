package one.digitalinnovation.digionebank

class Gerente(
    none: String,
    cpf: String,
    salario: Double,
val senha: String

) : Funcionario(none = none , cpf = cpf , salario = salario), Logavel {
    override fun calculoAuxilio(): Double = salario * 0.4

    override fun login(): Boolean = "123" == senha
}