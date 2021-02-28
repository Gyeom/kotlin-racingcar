package step3.ui

import step3.util.Message.Companion.NOTICE_INPUT_CAR_COUNT
import step3.util.Message.Companion.NOTICE_INPUT_TRY_COUNT
import step3.util.extension.toInt

fun getCountOfGame(): Int {
    println(NOTICE_INPUT_TRY_COUNT)
    return readLine().toInt()
}

fun getCountOfCar(): Int {
    println(NOTICE_INPUT_CAR_COUNT)
    return readLine().toInt()
}
