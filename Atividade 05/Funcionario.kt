fun main() {
    


}

class Funcionario (nome: String, salarioBruto: Double, desconto: Double){
    var nome: String = " "
    var salarioBruto: Double = 0.0
    var desconto: Double = 0.0

    fun salarioLiquido(): Double{
        return salarioBruto - desconto
    }

    fun aumentarSalario(porcentagem: Double){
        salarioBruto += ((salarioBruto*porcentagem)/100)
    }
    
}
