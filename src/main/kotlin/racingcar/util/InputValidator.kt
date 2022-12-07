package racingcar.util

import java.lang.IllegalArgumentException

class InputValidator {
    fun validateCarNames(carNames: List<String>): List<String> {
        validateCarNamesLength(carNames)
        return carNames
    }

    private fun validateCarNamesLength(carNames: List<String>) {
        carNames.forEach { carName ->
            validateCarNameLength(carName)
        }
    }

    private fun validateCarNameLength(carName: String) {
        if (carName.length !in (MIN_CAR_NAME_LENGTH..MAX_CAR_NAME_LENGTH)) {
            throw IllegalArgumentException(INVALID_CAR_NAME_LENGTH)
        }
    }
}