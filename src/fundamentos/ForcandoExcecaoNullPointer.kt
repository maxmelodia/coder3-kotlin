package fundamentos
//A terceira opção é para amantes do NPE: o operador de asserção não nulo (!!) converte qualquer valor
// em um tipo não nulo e lança uma exceção se o valor for nulo. Podemos escrever b !!, e isso retornará
// um valor não nulo de b (por exemplo, uma String em nosso exemplo) ou lançar um NPE se b for nulo:
//Fonte: https://kotlinlang.org/docs/reference/null-safety.html
fun main() {
    //!! força a chamada de uma variável mesmo sabendo que ela pode estar null, nesse caso
    //caso esteja null é gerado o erro "NullPointerException" confome exemplo abaixo:

    var a: Int? = null
    println(a?.inc())

    println("Momento do erro...")
    println(a!!.inc())

}