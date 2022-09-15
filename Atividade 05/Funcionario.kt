fun main() {

    var funcionario = Funcionario()

    println("Nome: ")
    funcionario.nome = readLine().toString()
    println("Salario Bruto: ")
    funcionario.salarioBruto = readLine().toString().toDouble()
    println("Desconto: ")
    funcionario.desconto = readLine().toString().toDouble()

    println("Nome: ${funcionario.nome}")
    println("Salario Liquido: R$ ${funcionario.salarioLiquido()}")

    println("Porcentagem de aumento: ")
    var porcentagem = readLine().toString().toDouble()

    println("Nome: ${funcionario.nome}")
    println("Salario Liquido: R$ ${funcionario.salarioLiquido()}")
    funcionario.aumentarSalario(porcentagem)
    println("Salario com aumento: R$ ${funcionario.salarioLiquido()}")


}

data class Funcionario(var nome: String = " ", var salarioBruto: Double = 0.0, var desconto: Double = 0.0){

    fun salarioLiquido(): Double{
        return salarioBruto - desconto
    }

    fun aumentarSalario(porcentagem: Double){
        salarioBruto += (porcentagem/100)*salarioBruto
    }

}
