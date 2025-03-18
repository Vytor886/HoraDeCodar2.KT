fun main() {
    fun main() {
        println("Digite um número:")
        val num = readLine()!!.toDouble()

        when {
            num > 0 -> println("O número é positivo")
            num < 0 -> println("O número é negativo")
            else -> println("O número é zero")
        }
    }

}