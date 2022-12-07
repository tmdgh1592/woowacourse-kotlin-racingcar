package racingcar.domain

import racingcar.util.CAR_POSITION_MARK

data class Car(
    private val name: String,
    private var position: Int = 0
) {
    fun forward() = ++position

    private fun convertPosition(): String = CAR_POSITION_MARK.repeat(position)

    override fun toString(): String =
        "$name : ${convertPosition()}"
}
