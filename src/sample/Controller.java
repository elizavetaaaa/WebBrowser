package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;

public class Controller {

    @FXML
    private WebView webView;

    @FXML
    private Button yandexButton;

    @FXML
    private Button ramblerButton;

    @FXML
    void jumpGoogle(ActionEvent event) {
        WebEngine engine = webView.getEngine();
        engine.load("https://www.google.com");
    }

    @FXML
    void jumpYandex(ActionEvent event) {
        WebEngine engine = webView.getEngine();
        engine.load("https://yandex.com/");

    }

    @FXML
    void jumpRambler(ActionEvent event) {
        WebEngine engine = webView.getEngine();
        engine.load("https://www.rambler.ru/");

    }


}
