package racingcar.domain

data class Car(
    private val name: String,
    private var position: Int = 0
) {
    fun forward() = ++position
}
