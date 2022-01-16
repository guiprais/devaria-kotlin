fun main(args: Array<String>) {
//    validar se vieram produtos nos argumentos
    if (args.isEmpty()) {
        println("Favor informar sua lista de produtos para verificarmos adisponibilidade")
        return
    }

//    validar se esses produtos estão da lista de itens disponíveis do marcado
    val productsAvailable = arrayOf("Pão", "Bolacha", "Arroz", "Ovo", "Feijão", "Frango", "Azeite", "Óleo")

    val productsRequestedAvailable = args.filter { requestedProduct -> productsAvailable.contains(requestedProduct) }

//    for(productSelectedAvailable in productsRequestedAvailable) {
//        println("Este produto nós temos: $productSelectedAvailable")
//    }

    productsRequestedAvailable.forEach { productSelectedAvailable -> println("Este produto nós temos: $productSelectedAvailable") }

    val productsRequestedNotAvailable =
        args.filter { productRequested -> !productsAvailable.contains(productRequested) }

    productsRequestedNotAvailable.forEach { productNoAvailable -> println("Este produto nós não temos, infelizmente: $productNoAvailable") }

    val sortedProducts = productsAvailable.sortedBy { product -> product }
    sortedProducts.forEach { product -> println("Confira este produto disponível: $product") }
}