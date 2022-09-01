fun main( ) {
    var soma = 0
    var cont = 1

    while (cont <= 100) {
        if (cont < 100) {
            print("$cont + ")
            soma = soma + cont
            cont ++
        }else{
            print("100 = $soma")
            break
        }
    }

}