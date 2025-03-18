fun main() {
    println("Digite seis números:")
    val numeros = List(6) { readLine()!!.toDouble() }

    val media = numeros.average()

    println("Números informados: $numeros")
    println("Média aritmética: %.2f".format(media))
}
