package racingcar.domain

import racingcar.util.FORWARD_CONDITION

enum class Move {
    MOVING_FORWARD,
    STOP;

    companion object {
        fun convertMove(number: Int): Move {
            if (number >= FORWARD_CONDITION) {
                return MOVING_FORWARD
            }
            return STOP
        }
    }
}