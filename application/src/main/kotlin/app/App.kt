package app

import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.Scene
import javafx.scene.control.Label
import core.AppContext

class App : Application() {
    override fun start(primaryStage: Stage) {
        primaryStage.scene = Scene(Label(AppContext.title))
        primaryStage.show()
    }
}
