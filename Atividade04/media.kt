fun main() {
 var c = 0
 var n1 : Double
 var n2 : Double
 var provaUm = mutableListOf<Double>()
 var provaDois = mutableListOf<Double>()
 var media = mutableListOf<Double>()

 while (c < 3){
  println("Digite a nota da Primeira Prova: ")
  n1 = readLine().toString().toDouble()
  provaUm.add(n1)

  println("Digite a nota da Segunda Prova: ")
  n2 = readLine().toString().toDouble()
  provaDois.add(n2)

  media.add((n1+n2)/2)
   c++
  }

 c = 0
 println("NOTAS")
 while (c < 3){

  println("Aluno ${c+1}: média ${media[c]}")
  c++
 }

}
