fun main( ) {
    var n1: Int
    var maior: Int = 0
    var menor: Int = 1000
    var contador : Int = 0

    while (contador < 5){
        println("Digite um número de 0 a 1000: ")
        n1 = readLine().toString().toInt()
        if (n1 > maior){ maior = n1}
        if (n1 < menor){ menor = n1}
        contador ++
    }

    println("O menor valor é $menor e o maior valor é $maior")

}
