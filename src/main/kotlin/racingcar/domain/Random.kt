package racingcar.domain

import camp.nextstep.edu.missionutils.Randoms.pickNumberInRange
import racingcar.util.RANDOM_END_RANGE
import racingcar.util.RANDOM_START_RANGE

class Random {
    operator fun invoke(): Int = pickNumberInRange(
        RANDOM_START_RANGE, RANDOM_END_RANGE
    )
}