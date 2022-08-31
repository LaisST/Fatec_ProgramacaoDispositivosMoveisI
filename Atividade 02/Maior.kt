fun main( ) {
    var n1: Int
    var n2: Int
    var n3: Int

    println("Digite um número: ")
    n1 = readLine().toString().toInt()

    println("Digite outro número: ")
    n2 = readLine().toString().toInt()

    println("Digite outro número: ")
    n3 = readLine().toString().toInt()

    if (n1 > n2 && n1 > n3) {
        print("$n1 é o maior número")
    } else if (n2 > n1 && n2 > n3) {
        print("$n2 é o maior número")
    } else {
        print("$n3 é o maior número")
    }
}