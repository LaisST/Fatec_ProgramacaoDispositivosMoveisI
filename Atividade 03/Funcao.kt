fun Funcao( ) {
    var funcao: Int


    do  {
        println("\n==========FUNÇÕES========")
        println("1 - Fatorial")
        println("2 - Quadradro de um número")
        println("3 - Volume de uma lata")
        println("4 – Sair do Programa")

        println("Digite o código da Função: ")
        funcao = readLine().toString().toInt()
        when (funcao) {
            1 -> fatorial()
            2 -> quadrado()
            3 -> volumeLata()
            else -> println("Código Inválido!!") }

    } while (funcao != 4)
    println("Finalizado!")

}

fun fatorial( ) {
    var numero: Int
    var cont: Int
    var fat : Int = 1

    println("Digite um número inteiro: ")
    numero = readLine().toString().toInt()
    cont = numero
    print("$numero! = ")
    while (cont > 0){
        if (cont > 1 ) {
            print("$cont x ")
            fat = fat * cont
            cont = cont - 1
        }else{
            print("1 = $fat")
            break
        }
    }
}

fun quadrado() {
    var A : Int
    var quadrado : Int

    println("Digite um número inteiro: ")
    A = readLine().toString().toInt()
    quadrado = A*A

    println("$A² = $quadrado")

}

fun volumeLata() {
    var altura : Double
    var raio : Double
    var volume : Double

    println("Digite a altura da lata: ")
    altura = readLine().toString().toDouble()

    println("Digite o raio da lata: ")
    raio = readLine().toString().toDouble()

    volume = 3.1 * (raio*raio) * altura

    println("O volume da lata é $volume Cm²")

}
