fun main(args: Array<String>) {
    for (index in args.indices) {
        println("Percorrendo os argumentos posição: $index e valor ${args[index]}")
    }

    for (indexDecrement in args.size - 1 downTo 0) {
        println("Percorrendo os argumentos de forma decrescente posição: $indexDecrement e valor ${args[indexDecrement]}")
    }

//    forEach
    for (arg in args) {
        println("Percorrendo os argumentos com forEach valor: $arg")
    }

//     while
    var count = 0
    while (count < args.size) {
        println("Percorrendo os argumentos com while argumentos lidos: ${++count} valor lido: ${args[count - 1]}")
    }

//    do while
    var loopsCount = 0
    do {
        println("Percorrendo os argumentos com o do while, total loops: $loopsCount e valor lido ${args[loopsCount]}")
        loopsCount++
    } while (loopsCount < args.size)
}