package racingcar.util

import java.lang.IllegalArgumentException

class InputValidator {

    /**
     * 자동차 이름 입력 검증
     * @carNames 입력받은 자동차 이름을 리스트로 변환한 파라미터
     * */

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


    /**
     * 시도 횟수 입력 검증
     * @tryCount 입력받은 시도 횟수
     * */

    fun validateTryCount(tryCount: String): Int {
        val convertedTryCount = tryCount.toIntOrNull()
        return convertedTryCount ?: throw IllegalArgumentException(INVALID_TRY_COUNT_TYPE)
    }
}