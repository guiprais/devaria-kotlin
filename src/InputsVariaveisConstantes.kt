fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Favor informar um argumento válido")
        return
    }

    val number = args[0].toIntOrNull()

    if (number == null) {
        println("O valor informado não é um número válido!")
        return
    }

    println("O número digitado foi: $number")

    var sum = 0;
    sum = number + number
    println("A soma do número + número é de: $sum")
}