package fundamentos.controle

//Deprecated.
fun main() {

    val nota: Double = 9.3
    //Usando operador range (Sempre do menor para o maior.)

    if (nota in 9.0..10.0) { //significa que qualquer nota que estiver entre 9 e 10 será retornada.
        println("Fantástico....")
    } else if (nota in 7.0..8.0) {
        println("Parabéns....")
    } else if (nota in 4.0..6.0) {
        println("Tem como recuperar....")
    } else if (nota in 0.0..3.0) {
        println("Te vejo no próximo semestre....")
    } else {
        println("Nota Inválida....")
    }

}