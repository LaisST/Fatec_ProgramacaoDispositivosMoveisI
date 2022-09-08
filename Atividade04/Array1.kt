fun Array1() {
 val numeros = Array<Int>( 11, {i -> i})
 numeros[0] = 0
 numeros[1] = 1
 numeros[2] = 2
 numeros[3] = 3
 numeros[4] = 4
 numeros[5] = 5
 numeros[6] = 6
 numeros[7] = 7
 numeros[8] = 8
 numeros[9] = 9
 numeros[10] = 10

 for( i in 1..10)
 {
  println(numeros[i])
 }
}
