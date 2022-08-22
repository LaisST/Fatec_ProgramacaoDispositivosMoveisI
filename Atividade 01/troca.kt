fun troca() {
  var A : Int
  var B: Int
  var X : Int
  
  println("Digite o valor de A: ")
  A = readLine().toString().toInt()

  println("Digite o valor de B ")
  B = readLine().toString().toInt()

  X = A
  A = B
  B = X

  println("Os valores trocados são A = $A e B = $B")
  
}