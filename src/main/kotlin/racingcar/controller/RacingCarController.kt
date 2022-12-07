package racingcar.controller

import racingcar.domain.Car
import racingcar.presentation.InputView.inputCarNames
import racingcar.presentation.InputView.inputTryCount
import racingcar.service.RacingCarService
import racingcar.util.factory.CarFactory

class RacingCarController(
    private val racingCarService: RacingCarService = RacingCarService()
) {

    fun run() {
        val cars = convertCar(readCarNames())
        val tryCount = readTryCount()
        val raceResult = race(tryCount, cars)
    }

    private fun readCarNames(): List<String> = inputCarNames()

    private fun readTryCount(): Int = inputTryCount()

    private fun race(totalRound: Int, cars: List<Car>) {
        for (round in 0 until totalRound) {
            racingCarService.startRound(cars)
        }
    }

    private fun convertCar(carNames: List<String>) = CarFactory.createAll(carNames)
}