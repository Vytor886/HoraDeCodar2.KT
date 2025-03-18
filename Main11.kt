//Uma micro calculadora
//Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das seguintes operações a serem executadas (codificada da seguinte forma: 1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação).
//O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos.

//Observação: Considere que só serão lidos os valores 1, 2, 3 ou 4 para as operações

fun main() {
    println("Digite o primeiro número inteiro:")
    val num1 = readLine()!!.toInt()

    println("Digite o segundo número inteiro:")
    val num2 = readLine()!!.toInt()

    println("Escolha a operação:")
    println("1 - Adição (+)")
    println("2 - Subtração (-)")
    println("3 - Divisão (/)")
    println("4 - Multiplicação (*)")

    val operacao = readLine()!!.toInt()
    val resultado = when (operacao) {
        1 -> num1 + num2
        2 -> num1 - num2
        3 -> if (num2 != 0) num1 / num2 else {
            println("Erro: Divisão por zero não é permitida.")
            return
        }
        4 -> num1 * num2
        else -> {
            println("Opção inválida! Escolha um número entre 1 e 4.")
            return
        }
    }

    println("O resultado da operação é: $resultado")
}
