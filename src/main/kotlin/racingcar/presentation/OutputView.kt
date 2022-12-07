package racingcar.presentation

object OutputView {
    fun printMessage(message: String) = println(message)

    fun printError(throwable: Throwable) {
        println(throwable.message)
    }

    fun printError(error: Exception) {
        println(error.message)
    }

    fun printEnter() {
        println()
    }
}