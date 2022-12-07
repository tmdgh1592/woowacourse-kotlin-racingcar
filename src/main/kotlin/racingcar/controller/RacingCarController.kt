package racingcar.controller

import racingcar.presentation.InputView.inputCarNames
import racingcar.presentation.InputView.inputTryCount
import racingcar.service.RacingCarService
import racingcar.util.factory.CarFactory

class RacingCarController(
    private val racingCarService: RacingCarService
) {

    fun run() {
        val cars = convertCar(readCarNames())
        val tryCount = readTryCount()
    }

    private fun readCarNames(): List<String> = inputCarNames()

    private fun readTryCount(): Int = inputTryCount()

    private fun convertCar(carNames: List<String>) = CarFactory.createAll(carNames)
}