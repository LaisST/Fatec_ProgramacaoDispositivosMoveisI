fun main() {
 val a = Array<Int>( 11, {i -> i})
 a[0] = 0
 a[1] = 1
 a[2] = 2
 a[3] = 3
 a[4] = 4
 a[5] = 5
 a[6] = 6
 a[7] = 7
 a[8] = 8
 a[9] = 9
 a[10] = 10

 var b = mutableListOf<Int>()

 for (n in a){
  var x = a[n]*2
  b.add(x)
 }
 print("Lista a: ")
 for( i in 1..10)
 {
  print(a[i])
 }
println(" ")
 for( i in 1..10)
 {
  println("${a[i]} x 2 =  ${b[i]}")
 }
}
