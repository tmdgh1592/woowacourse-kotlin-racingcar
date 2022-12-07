package racingcar.presentation

object OutputView {
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