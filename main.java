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

        HBox hBox1 = new HBox();
        hBox1.setPadding(new Insets(10));
        hBox1.setSpacing(10);
        hBox1.getChildren().addAll(label, mComboFont);

        label = new Label("Font Style");
        label.setPrefWidth(70);
        mCheckBold = new CheckBox("Bold");
        mCheckItalic = new CheckBox("Italic");
        mCheckBold.setOnAction(e -> onAction());
        mCheckItalic.setOnAction(e -> onAction());

        HBox hBox2 = new HBox();
        hBox2.setPadding(new Insets(10));
        hBox2.setSpacing(10);
        hBox2.getChildren().addAll(label, mCheckBold, mCheckItalic);

        label = new Label("Font Size");
        label.setPrefWidth(70);
        mRadioSmall = new RadioButton("Small");
        mRadioMedium = new RadioButton("Medium");
        mRadioLarge = new RadioButton("Large");
        ToggleGroup g = new ToggleGroup();
        mRadioSmall.setToggleGroup(g);
        mRadioMedium.setToggleGroup(g);
        mRadioLarge.setToggleGroup(g);
        mRadioSmall.setSelected(true);
        mRadioSmall.setOnAction(e -> onAction());
        mRadioMedium.setOnAction(e -> onAction());
        mRadioLarge.setOnAction(e -> onAction());

        HBox hBox3 = new HBox();
        hBox3.setPadding(new Insets(10));
        hBox3.setSpacing(10);
        hBox3.getChildren().addAll(label,mRadioSmall,mRadioMedium,mRadioLarge);

        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(10));
        vBox.getChildren().addAll(mLabelText, hBox1, hBox2, hBox3);

        stage.setScene(new Scene(vBox));
        stage.show();
    }
}
