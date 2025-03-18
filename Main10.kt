//Tendo como entrada a altura e o gênero designado ao nascer(codificado da seguinte forma: 1: feminino - 2: masculino - )
//de uma pessoa, construa um programa que calcule e imprima seu peso ideal,utilizando as seguintes
//fórmulas. (( H = Altura ))
// -Para Homens = (72.7 * h) - 52
// -Para mulheres = (62.1 * h) - 44.7
fun main() {
    println("Digite sua altura em metros (exemplo: 1.75):")
    val altura = readLine()!!.toDouble()

    println("Digite seu gênero designado ao nascer (1 para feminino, 2 para masculino):")
    val genero = readLine()!!.toInt()

    val pesoIdeal = when (genero) {
        1 -> (62.7 * altura) - 44.7  // Cálculo para mulheres
        2 -> (72.7 * altura) - 58.0  // Cálculo para homens
        else -> {
            println("Opção inválida. Por favor, digite 1 para feminino ou 2 para masculino.")
            return
        }
    }

    println("Seu peso ideal é: %.2f kg".format(pesoIdeal))
}
