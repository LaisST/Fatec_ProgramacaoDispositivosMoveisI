fun main( ) {
    var codigo: Int
    var quant: Int

    println("============MENU==================")
    println(" [100] - Cachorro Quente | R$ 1,20")
    println(" [101] - Bauru Simples   | R$ 1,30")
    println(" [102] - Bauru com ovo   | R$ 1,50")
    println(" [103] - Hamburguer      | R$ 1,20")
    println(" [104] - Cheeseburguer   | R$ 1,30")
    println(" [105] - Refrigerante    | R$ 1,00")

    println("Digite o código do produto: ")
    codigo = readLine().toString().toInt()

    println("Digite a quantidade de produtos: ")
    quant = readLine().toString().toInt()

    when (codigo){
        100 -> println("O valor total é R$ ${quant*1.20}")
        101 -> println("O valor total é R$ ${quant*1.30}")
        102 -> println("O valor total é R$ ${quant*1.50}")
        103 -> println("O valor total é R$ ${quant*1.20}")
        104 -> println("O valor total é R$ ${quant*1.30}")
        105 -> println("O valor total é R$ ${quant*1.00}")
        else -> println("Código Invalido!")
    }
}