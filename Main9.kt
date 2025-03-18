//Escreva um programa para ler o ano de nascimento de uma pessoa e
// escrever uma mensagem que diga
//se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).

import java.time.Year

fun main() {
    println("Digite o ano do seu nascimento:")
    val anoNascimento = readLine()!!.toInt()

    val anoAtual = Year.now().value
    val idade = anoAtual - anoNascimento

    if (idade >= 16) {
        println("Você pode votar este ano.")
    } else {
        println("Você ainda não pode votar este ano.")
    }
}
