fun main() {


    //Escreva um programa que calcule a média de quatro números informados pelo usuário,
    //mas somente se esses números forem maiores que 0 e menores que 10.
    //No final, se a média for maior que cinco o usuário receberá uma mensagem
    //"Você passou no teste".
    //Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"

    println("Digite quatro números entre 0 e 10:")
    val numeros = List(4) { readLine()!!.toDouble() }

    // Filtrar apenas os números dentro do intervalo permitido
    val numerosValidos = numeros.filter { it in 0.0..10.0 }

    if (numerosValidos.size == 4) {
        val media = numerosValidos.average()
        println("Média: %.2f".format(media))

        if (media > 5) {
            println("Você passou no teste")
        } else {
            println("Tente novamente")
        }
    } else {
        println("Todos os números devem estar entre 0 e 10!")
    }
}
