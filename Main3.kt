    fun main() {
        println("Digite três números distintos:")
        val a = readLine()!!.toDouble()
        val b = readLine()!!.toDouble()
        val c = readLine()!!.toDouble()

        val maior = maxOf(a, b, c)
        println("O maior número é: $maior")
    }

}
