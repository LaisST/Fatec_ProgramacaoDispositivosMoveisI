package Aula06

fun IArray(){
    val numeros = Array<Int>( 3, {i -> i})

    for (numero in numeros){
       println(numero)
    }
}

fun ArrayListOf(){
    val alunos = arrayListOf("João", "Maria", "Marcos")

    for (aluno in alunos){
        println(aluno)
        println(aluno.toUpperCase())
    }
}

