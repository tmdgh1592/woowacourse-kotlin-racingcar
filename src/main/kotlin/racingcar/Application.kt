package racingcar

import racingcar.controller.RacingCarController
import racingcar.presentation.InputView
import racingcar.presentation.OutputView
import racingcar.service.RacingCarService

fun main() {
    val inputView = InputView()
    val outputView = OutputView()
    val racingCarService = RacingCarService()
    val racingCarController = RacingCarController(inputView, outputView, racingCarService)
    racingCarController.run()
}