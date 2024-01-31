package ba.unsa.etf.rpr.lv7.lv7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        KorisniciModel model = new KorisniciModel();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("korisnici.fxml"));
        loader.setController(new Controller(model));
        Parent root = loader.load();
        stage.setTitle("Korisnici");
        stage.setResizable(false);
        stage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}