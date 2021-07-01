package one.digitalinnovation.digionebank

class Analista(
    none: String,
    cpf: String,
    salario: Double
) : Funcionario(none, cpf, salario) {
       override fun calculoAuxilio() = salario * 0.1
}