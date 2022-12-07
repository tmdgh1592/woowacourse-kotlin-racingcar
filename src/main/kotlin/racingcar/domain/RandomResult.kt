package racingcar.domain

import racingcar.util.FORWARD_CONDITION

enum class RandomResult {
    MOVING_FORWARD,
    STOP;

    companion object {
        fun convertDiceResult(number: Int): RandomResult {
            if (number >= FORWARD_CONDITION) {
                return MOVING_FORWARD
            }
            return STOP
        }
    }
}