fun main( ) {
    var n1: Int

    println("Digite um número inteiro: ")
    n1 = readLine().toString().toInt()

    if (n1 %2 == 0 ){
        print("$n1 é par")
    }else{
        print("$n1 é impar")
    }
}