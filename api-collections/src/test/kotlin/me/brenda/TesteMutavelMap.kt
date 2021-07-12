package me.brenda

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 2000.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, tipoContratacao = "CLT")

        val repositorio = Repositorio<Funcionario>()

    repositorio.created(joao.nome, joao)
    repositorio.created(pedro.nome, pedro)
    repositorio.created(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    println("----------------------------")
    repositorio.findAll().forEach { println(it) }

    println("----------------------------")
    (repositorio.remove(maria.nome))
    repositorio.findAll().forEach { println(it) }


}