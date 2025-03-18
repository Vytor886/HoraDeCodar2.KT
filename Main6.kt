fun main() {
    println("Digite quatro números distintos:")
    val numeros = List(4) { readLine()!!.toDouble() }

    println("Primeiro número: ${numeros.first()}")
    println("Último número: ${numeros.last()}")
    println("Maior número: ${numeros.maxOrNull()}")
}
