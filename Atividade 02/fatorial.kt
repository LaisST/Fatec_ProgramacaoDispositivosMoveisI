fun main( ) {
    var numero: Int
    var cont: Int
    var fat : Int = 1

    println("Digite um número inteiro: ")
    numero = readLine().toString().toInt()
    cont = numero
    print("$numero! = ")
    while (cont > 0){
        if (cont > 1 ) {
            print("$cont x ")
            fat = fat * cont
            cont = cont - 1
        }else{
            print("1 = $fat")
            break
        }

    }
}