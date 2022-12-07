package racingcar.presentation

import racingcar.domain.Car
import racingcar.util.WINNER_RESULT_MESSAGE
import racingcar.util.WINNER_SPLITTER

object OutputView {
    fun printRoundResult(cars: List<Car>) {
        cars.forEach { car -> println(car) }
        printEnter()
    }

    fun printWinners(winners: List<String>) {
        print(WINNER_RESULT_MESSAGE)
        print(winners.joinToString(WINNER_SPLITTER))
    }

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