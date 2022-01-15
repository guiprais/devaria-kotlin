fun main() {
    println("Favor informar o nome do convidado:")
    val name = readLine()

    if (name.isNullOrEmpty() || name.isNullOrBlank()) {
        println("Nome informado não é válido")
        return
    }

    println("Favor informar a idade do convidado:")
    val age = readLine()?.toIntOrNull()

    if (age == null || age <= 0) {
        println("A idade informadao não é válida")
        return
    }

    var isInvited = false

    when(name) {
        "Guilherme" -> isInvited = true
        "Rafa" -> isInvited = true
        "Kaique" -> isInvited = true
        else -> isInvited = false
    }

    if (isInvited && age >= 18) {
        println("Bem vindo a festa Kotlin Devaria 2021")
    } else if (!isInvited) {
        println("Você não está na lista de convidados, verifique com a pessoa que te chamou!")
    } else {
        println("Você não tem idade para entrar na festa")
    }
}