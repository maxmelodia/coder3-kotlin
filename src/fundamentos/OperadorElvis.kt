package fundamentos

//O seguinte é especialmente verdadeiro para Kotlin:

//Algumas linguagens de programação de computador têm semânticas diferentes para este operador.
// Em vez de o primeiro operando ter que resultar em um booleano, ele deve resultar em uma referência de objeto .
// Se a referência do objeto resultante não for null, ela será retornada. Caso contrário, o valor do segundo
// operando (que pode ser null) é retornado. Se o segundo operando for nulo, o operador também poderá lançar
// uma exceção.
//Fonte: https://qastack.com.br/programming/48253107/what-does-do-in-kotlin-elvis-operator

fun main() {
    val opcional: String? = null
    val obrigatorio: String = opcional ?: "Valor Padrão"

    //Nesse caso, a variável opcional pode ser null mas a variável obrigatorio não!
    //O operador Elvis Operator (?:) adiciona um "valor padrão" à variável obrigatorio caso seja null.

    println(obrigatorio)
}