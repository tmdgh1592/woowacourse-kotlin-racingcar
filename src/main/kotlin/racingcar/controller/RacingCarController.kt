package racingcar.controller

import racingcar.presentation.InputView.inputCarNames
import racingcar.util.factory.CarFactory

class RacingCarController {

    fun run() {
        val cars = convertCar(readCarNames())
    }

    private fun readCarNames(): List<String> = inputCarNames()

    private fun convertCar(carNames: List<String>) = CarFactory.createAll(carNames)
}