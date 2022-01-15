import java.math.BigDecimal

fun calculateOperation(firstNumber: BigDecimal, operator: String, secondNumber: BigDecimal): BigDecimal {
    when(operator) {
        "+" -> return firstNumber + secondNumber
        "-" -> return firstNumber - secondNumber
        "*" -> return firstNumber * secondNumber
        "/" -> return firstNumber / secondNumber
        "%" -> return firstNumber % secondNumber
        else -> return BigDecimal.ZERO
    }
}

fun main() {
    println("Digite um número válido:")

    val firstNumber = readLine()?.toBigDecimal()

    if (firstNumber == null) {
        println("Primeiro número informado não é válido")
        return
    }

    println("Digite um operador válido (+, -, *, /, %):")
    val operator = readLine()

    if (operator.isNullOrEmpty() || operator.isNullOrBlank() || (operator != "+" && operator != "-" && operator != "*" && operator != "/" && operator != "%")) {
        println("Operador invlálido")
        return
    }

    println("Digite um número válido:")

    val secondNumber = readLine()?.toBigDecimal()

    if (secondNumber == null) {
        println("Primeiro número informado não é válido")
        return
    }

    val result = calculateOperation(firstNumber, operator, secondNumber)

    println("O resultado da sua operação foi: $result")
}