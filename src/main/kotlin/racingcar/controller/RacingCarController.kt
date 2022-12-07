package racingcar.controller

import racingcar.domain.Car
import racingcar.presentation.InputView
import racingcar.presentation.OutputView
import racingcar.service.RacingCarService
import racingcar.util.CAR_RACING_RESULT_MESSAGE
import racingcar.util.factory.CarFactory

class RacingCarController(
    private val inputView: InputView,
    private val outputView: OutputView,
    private val racingCarService: RacingCarService
) {
    fun run() {
        val cars = convertCar(readCarNames())
        val tryCount = readTryCount()
        race(tryCount, cars)
    }

    private fun race(totalRound: Int, cars: List<Car>) {
        outputView.printMessageWithLine(CAR_RACING_RESULT_MESSAGE)
        for (round in 0 until totalRound) {
            racingCarService.startRound(cars)
            printRoundResult(cars)
        }
        printWinners(getWinners(cars))
    }

    private fun getWinners(cars: List<Car>) = racingCarService.getWinners(cars)

    private fun readCarNames(): List<String> = inputView.inputCarNames()

    private fun readTryCount(): Int = inputView.inputTryCount()

    private fun printRoundResult(cars: List<Car>) = outputView.printRoundResult(cars)

    private fun printWinners(winners: List<String>) = outputView.printWinners(winners)

    private fun convertCar(carNames: List<String>) = CarFactory.createAll(carNames)
}