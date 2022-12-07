package racingcar

import camp.nextstep.edu.missionutils.test.NsTest
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class ApplicationTest : NsTest() {
    @Test
    fun 전진_정지() {
        camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest(
            {
                run("pobi,woni", "1")
                Assertions.assertThat(output()).contains("pobi : -", "woni : ", "최종 우승자 : pobi")
            }, MOVING_FORWARD, STOP
        )
    }

    @Test
    fun 이름에_대한_예외_처리() {
        camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest {
            runException("pobi,javaji")
            Assertions.assertThat(output()).contains(ERROR_MESSAGE)
        }
    }

    public override fun runMain() {
        main()
    }

    companion object {
        private const val MOVING_FORWARD = 4
        private const val STOP = 3
        private const val ERROR_MESSAGE = "[ERROR]"
    }
}