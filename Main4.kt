fun main() {
        println("Digite três números distintos:")
        val a = readLine()!!.toDouble()
        val b = readLine()!!.toDouble()
        val c = readLine()!!.toDouble()

        val menor = minOf(a, b, c)
        val somaDosDoisMaiores = a + b + c - menor

        println("A soma dos dois maiores números é: $somaDosDoisMaiores")
    }

}