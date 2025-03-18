fun main() {


    print("Digite dois números: ")

    val num1 = readln()!!. toDouble()
    val num2 = readln()!!. toDouble()

    val maior = if (num1 > num2) num1 else num2
    print("O número maior é: $maior")
}