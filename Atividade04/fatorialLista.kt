fun main() {
 var a = mutableListOf<Int>()
 var b = mutableListOf<Int>()
 var c = 0
 var fat = 1



 while (c < 5) {
  fat = 1
  println("Digite um número inteiro: ")
  var n = readLine().toString().toInt()
  a.add(n)
  var cont = n
  while (cont > 0) {
   fat = fat * cont
   cont = cont - 1
  }
  b.add(fat)
  c++
 }

c = 0
 while (c < 5){
  println("${a[c]}! = ${b[c]}")
  c++
 }

 println("Lista a : $a")
 println("Lista b : $b")
}
