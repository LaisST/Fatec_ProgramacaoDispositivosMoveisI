/*Podemos definir Kotlin como uma linguagem de programação pragmática que
combina os paradigmas de Orientação a Objetos e Programação Funcional
com foco em interoperabilidade, segurança, clareza e suporte a
ferramentas.*/

fun PrimeiroPrograma(){ println("Hello World")}
//fun: palavra reservada para declarar função
//PrimeiroPrograma: Nome da função
// {} Delimita o corpo da função, onde as instruções devem ser realizadas pela função
//prinln(): Função para exibir conteúdo (saída)

fun ValVar(){
    //Val: Valor imutável, não pode ser alterado após declarada
    //Var: variável mútavel, pode ser alterada durante o processo.

    //val nomeDaVal : Tipo
    val nome: String = "Lais"
    var numero: Int
}

fun valorNull(){
    //Safe call operator: No Kotlin significa que a variável pode ter valor nulo
    var a:Int? = null
    println(a)
}

fun OperadorElvis(){
     // ?:
    var a:String? = null
    val b: String = a ?: "Teste"
    println (b)
}

fun OperadoresMatematicos(){
    var a:Int = 7
    var b:Int = 3
    b += a // b = b + a
    println(b)
    b -= 4 // b = b - 4
    println(b)
    b *=2 //b = b *2
    println(b)
    b /=2 //b = b /2
    println(b)
    b %=2 // b = b % 2
    println(b)
}

fun OperadoresAritmeticos(){
    var a:Int = 7
    var b:Int = 3
    val soma = a + b
    val subtracao = a - b
    val multiplicao = a * b
    val divisao = a / b
    val modulo = a % 2
    println("$soma $subtracao $multiplicao $divisao $modulo")
}

fun OperadoresRelacionais(){
    println(1 == 1)
    println(3 != 2)
    println(3 > 2)
    println(3 < 2)
    println(3 <= 2)
    println(3 >= 2)

}

fun OperadoresLogicos(){
    val a = true
    val b = false
    val r1 = a || b
    val r2 = a && b
    val r3 = a xor b
    print ("$r1 $r2 $r3")
}

fun OperadorTernario(){
    val nota: Double = 5.0
    val resultado: String = if (nota >= 6) "Aprovado" else "Reprovado"
    println(resultado)
}
fun Converter(){
    val a = 1
//Converte Número para String
    println(a.toString() + 1)
}

fun Checagem(){
    val valor: String = "Fatec"
    if (valor is String) {
        println(valor)
    } else if (valor !is String) {
        println("Não é uma String")
    }
}

fun geralBasico(){
    //var a: Int = 10
//var b: Int = 20
    var a: Int
    var b: Int
    println("Digite o primeiro número")
    a = readLine().toString().toInt()
    println("Digite o primeiro número")
    b = readLine().toString().toInt()
    var multiplica: Int
    multiplica = a * b
    print("O resultado da Multiplicação é $multiplica")

}
