import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class main extends Application {
    private Label mLabelText;
    private CheckBox mCheckBold, mCheckItalic;
    private RadioButton mRadioSmall, mRadioMedium, mRadioLarge;
    private ComboBox mComboFont;

    public static void main(String[] args) {
        launch();
    }

    public void start(Stage stage) {
        mLabelText = new Label("Sample Text");

        Label label = new Label("Font Family");
        label.setPrefWidth(70);
        mComboFont = new ComboBox();
        mComboFont.setPromptText("Font Family");
        mComboFont.getItems().addAll("Arial", "Consolas", "Times New Roman");
        mComboFont.setValue("Times New Roman");
        mComboFont.setOnAction(e -> onAction());
    }
}
