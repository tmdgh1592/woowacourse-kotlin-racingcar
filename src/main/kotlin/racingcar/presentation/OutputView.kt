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
        printMessage(WINNER_RESULT_MESSAGE)
        printMessage(winners.joinToString(WINNER_SPLITTER))
    }

    private fun printMessage(message: String) = print(message)

    fun printMessageWithLine(message: String) = println(message)

    fun printError(error: Exception) = println(error.message)

    fun printEnter() = println()
}