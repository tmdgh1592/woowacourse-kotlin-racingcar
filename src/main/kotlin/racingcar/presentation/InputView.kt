package racingcar.presentation

import camp.nextstep.edu.missionutils.Console
import racingcar.presentation.OutputView.printEnter
import racingcar.presentation.OutputView.printMessageWithLine
import racingcar.util.CAR_INPUT_SPLITTER
import racingcar.util.CAR_NAMES_INPUT_MESSAGE
import racingcar.util.InputValidator
import racingcar.util.TRY_COUNT_INPUT_MESSAGE

object InputView {
    private val inputValidator = InputValidator()

    fun inputCarNames(): List<String> {
        printMessageWithLine(CAR_NAMES_INPUT_MESSAGE)
        return try {
            val carNames = Console.readLine().split(CAR_INPUT_SPLITTER)
            inputValidator.validateCarNames(carNames.map { it.trim() })
        } catch (error: IllegalArgumentException) {
            OutputView.printError(error)
            inputCarNames()
        }
    }

    fun inputTryCount(): Int {
        printMessageWithLine(TRY_COUNT_INPUT_MESSAGE)
        return try {
            val tryCount = Console.readLine().trim()
            printEnter()
            inputValidator.validateTryCount(tryCount)
        } catch (error: IllegalArgumentException) {
            OutputView.printError(error)
            inputTryCount()
        }
    }
}