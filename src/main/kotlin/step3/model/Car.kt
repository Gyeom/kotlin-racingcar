package step3.model

import step3.util.Message.Companion.ONE_DISTANCE

data class Car(private var distance: Int = 0) {

    fun go() {
        distance++
    }

    fun whereIs() = ONE_DISTANCE.repeat(distance)
}
