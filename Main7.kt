fun main() {
    println("Digite seis números:")
    val numeros = List(6) { readLine()!!.toDouble() }

    val somaMenores72 = numeros.filter { it < 72 }.sum()

    println("Números informados: $numeros")
    println("Soma dos números menores que 72: $somaMenores72")
}
