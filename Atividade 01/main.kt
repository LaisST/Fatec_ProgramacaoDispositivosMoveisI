fun main() {
  var A : Int
  var resto : Int
  
  println("Digite um número inteiro: ")
  A = readLine().toString().toInt()
  resto = A%6

  println("O resto da divisão de $A por 6 é $resto")
  
}