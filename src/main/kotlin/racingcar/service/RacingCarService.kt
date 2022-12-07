package racingcar.service

import racingcar.domain.Car
import racingcar.domain.Random
import racingcar.domain.RandomResult

class RacingCarService {
    fun startRound(carRacers: List<Car>) {
        carRacers.forEach { racer ->
            forwardOrStop(racer)
        }
    }

    private fun forwardOrStop(racer: Car) {
        val randomResult = RandomResult.convertDiceResult(Random().invoke())
        if (randomResult == RandomResult.MOVING_FORWARD) {
            racer.forward()
        }
    }

    fun getWinners(carRacers: List<Car>): List<String> {
        val winnerStandard = carRacers.sortedDescending()[0]
        return carRacers.filter { it == winnerStandard }
            .map { it.name() }
    }
}