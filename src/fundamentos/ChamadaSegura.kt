package fundamentos

fun main() {
    // ? Safe Call Operator (Operador de chamada segura) ao colocar junto com uma variável,
    // significa que essa variável pode ter um valor null.

    var a: Int? = null
    println(a?.dec()) //Ao executar essa instrução no Java, ocorreria o NullPointerException
}