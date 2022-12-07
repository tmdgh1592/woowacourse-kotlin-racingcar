package racingcar.util.factory

import racingcar.domain.Car

object CarFactory {
    fun createAll(carNames: List<String>) = carNames.map { create(it) }

    private fun create(carName: String) = Car(carName)
}