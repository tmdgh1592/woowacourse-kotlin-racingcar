package racingcar.presentation

import racingcar.domain.Car

object OutputView {
    fun printRoundResult(cars: List<Car>) {
        cars.forEach { car -> println(car) }
        printEnter()
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