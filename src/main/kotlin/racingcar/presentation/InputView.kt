package racingcar.presentation

import camp.nextstep.edu.missionutils.Console
import racingcar.util.CAR_INPUT_SPLITTER
import racingcar.util.CAR_NAMES_INPUT_MESSAGE
import racingcar.util.InputValidator
import racingcar.util.TRY_COUNT_INPUT_MESSAGE

class InputView {
    private val outputView = OutputView()
    private val inputValidator = InputValidator()

    fun readCarNames(): List<String> {
        outputView.printMessageWithLine(CAR_NAMES_INPUT_MESSAGE)
        return try {
            val carNames = Console.readLine().split(CAR_INPUT_SPLITTER)
            inputValidator.validateCarNames(carNames.map { it.trim() })
        } catch (error: IllegalArgumentException) {
            outputView.printError(error)
            readCarNames()
        }
    }

    fun readTryCount(): Int {
        outputView.printMessageWithLine(TRY_COUNT_INPUT_MESSAGE)
        return try {
            val tryCount = Console.readLine().trim()
            outputView.printEnter()
            inputValidator.validateTryCount(tryCount)
        } catch (error: IllegalArgumentException) {
            outputView.printError(error)
            readTryCount()
        }
    }
}