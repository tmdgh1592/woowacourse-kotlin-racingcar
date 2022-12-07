package racingcar.util

// I/O message
const val CAR_NAMES_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"
const val TRY_COUNT_INPUT_MESSAGE = "시도할 회수는 몇회인가요?"

// Car
const val CAR_INPUT_SPLITTER = ","
const val MIN_CAR_NAME_LENGTH = 1
const val MAX_CAR_NAME_LENGTH = 5

// Error messages
const val ERROR_PREFIX = "[ERROR]"
const val INVALID_CAR_NAME_LENGTH = "$ERROR_PREFIX 자동차 이름의 길이는 최대 5글자입니다."
const val INVALID_TRY_COUNT_TYPE = "$ERROR_PREFIX 시도 횟수는 숫자만 입력할 수 있습니다."