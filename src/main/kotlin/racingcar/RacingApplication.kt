package racingcar

import racingcar.tasks.Game
import racingcar.ui.InputView
import racingcar.ui.OutputView

fun main() {
    run(Game())
}

private fun run(game: Game) {
    val listOfCar = game.settingRacingCar(InputView.getCountOfCar())
    val countOfGame = InputView.getCountOfGame()
    OutputView.noticeResult()
    repeat(countOfGame) {
        game.run(listOfCar)
    }
}
