package one.digitalinnovation.digionebank

class Gerente(
    none: String,
    cpf: String,
    salario: Double
) : Funcionario(none = none , cpf = cpf , salario = salario) {
    override fun calculoAuxilio(): Double = salario * 0.4

}