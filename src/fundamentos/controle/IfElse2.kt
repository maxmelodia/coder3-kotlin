package fundamentos.controle

//Posso retornar o valor de uma expressão para uma variável.
//No Java isso não é possível (até o momento).
fun main() {
    val num1: Int = 2
    val num2: Int = 3

    val maiorValor = if (num1 > num2) {
        println("Processando...")
        num1
    } else {
        println("Processando else...")
        num2
    }

    //val maiorValor = if (num1 > num2) num1 else num2

    println("O maior valor é $maiorValor.")
}