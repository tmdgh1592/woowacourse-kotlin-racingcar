package racingcar.util

// I/O message
const val CAR_NAMES_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"
const val TRY_COUNT_INPUT_MESSAGE = "시도할 회수는 몇회인가요?"
const val CAR_RACING_RESULT_MESSAGE = "실행 결과"
const val WINNER_RESULT_MESSAGE = "최종 우승자 : "

// Car
const val CAR_INPUT_SPLITTER = ","
const val CAR_POSITION_MARK = "-"
const val MIN_CAR_NAME_LENGTH = 1
const val MAX_CAR_NAME_LENGTH = 5

// Dice
const val RANDOM_START_RANGE = 0
const val RANDOM_END_RANGE = 9
const val FORWARD_CONDITION = 4

// Winner
const val WINNER_SPLITTER = ", "

// Error messages
const val ERROR_PREFIX = "[ERROR]"
const val INVALID_CAR_NAME_LENGTH = "$ERROR_PREFIX 자동차 이름의 길이는 최대 5글자입니다."
const val INVALID_TRY_COUNT_TYPE = "$ERROR_PREFIX 시도 횟수는 숫자만 입력할 수 있습니다."