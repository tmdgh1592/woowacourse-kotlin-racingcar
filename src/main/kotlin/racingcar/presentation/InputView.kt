package racingcar.presentation

import camp.nextstep.edu.missionutils.Console
import racingcar.util.CAR_INPUT_SPLITTER
import racingcar.util.CAR_NAMES_INPUT_MESSAGE
import racingcar.util.InputValidator

object InputView {
    private val inputValidator = InputValidator()

    fun inputCarNames(): List<String> {
        println(CAR_NAMES_INPUT_MESSAGE)
        return try {
            val carNames = Console.readLine().split(CAR_INPUT_SPLITTER)
            inputValidator.validateCarNames(carNames.map { it.trim() })
        } catch (error: IllegalArgumentException) {
            OutputView.printError(error)
            inputCarNames()
        }
    }
}