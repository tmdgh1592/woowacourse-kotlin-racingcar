package racingcar.domain

import racingcar.util.CAR_POSITION_MARK

data class Car(
    private val name: String,
    private var position: Int = 0
) : Comparable<Car> {
    fun forward() = ++position

    fun name() = name

    private fun convertPosition(): String = CAR_POSITION_MARK.repeat(position)

    override fun equals(other: Any?): Boolean {
        return position == (other as Car).position
    }

    override fun compareTo(other: Car): Int = position - other.position

    override fun toString(): String =
        "$name : ${convertPosition()}"

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + position
        return result
    }
}
