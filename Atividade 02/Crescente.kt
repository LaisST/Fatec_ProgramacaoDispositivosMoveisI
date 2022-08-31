fun Crescente( ){
    var n1: Int
    var n2: Int
    var n3: Int

    println("Digite um número: ")
    n1 = readLine().toString().toInt()

    println("Digite outro número: ")
    n2 = readLine().toString().toInt()

    println("Digite outro número: ")
    n3 = readLine().toString().toInt()

    for (n in ordenar(n1, n2, n3)) {
        println("$n ")
    }
}fun ordenar(vararg numeros: Int): IntArray{
    return numeros.sortedArray()

}