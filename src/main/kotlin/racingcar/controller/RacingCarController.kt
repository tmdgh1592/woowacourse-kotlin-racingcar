package racingcar.controller

import racingcar.domain.Car
import racingcar.presentation.InputView.inputCarNames
import racingcar.presentation.InputView.inputTryCount
import racingcar.presentation.OutputView
import racingcar.service.RacingCarService
import racingcar.util.CAR_RACING_RESULT_MESSAGE
import racingcar.util.factory.CarFactory

class RacingCarController(
    private val racingCarService: RacingCarService = RacingCarService()
) {
    fun run() {
        val cars = convertCar(readCarNames())
        val tryCount = readTryCount()
        race(tryCount, cars)
    }

    private fun race(totalRound: Int, cars: List<Car>) {
        OutputView.printMessageWithLine(CAR_RACING_RESULT_MESSAGE)
        for (round in 0 until totalRound) {
            racingCarService.startRound(cars)
            printRoundResult(cars)
        }
        printWinners(getWinners(cars))
    }

    private fun getWinners(cars: List<Car>) = racingCarService.getWinners(cars)

    private fun readCarNames(): List<String> = inputCarNames()

    private fun readTryCount(): Int = inputTryCount()

    private fun printRoundResult(cars: List<Car>) = OutputView.printRoundResult(cars)

    private fun printWinners(winners: List<String>) = OutputView.printWinners(winners)

    private fun convertCar(carNames: List<String>) = CarFactory.createAll(carNames)
}