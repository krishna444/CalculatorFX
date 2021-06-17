import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcController implements Initializable {
    private CalcHelper calcHelper;
    @FXML
    private Button button0;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;
    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button buttonPlus;

    @FXML
    private Button buttonMinus;

    @FXML
    private TextField textFieldDisplay;

    public CalcController() {
        this.calcHelper = new CalcHelper();
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        this.button0.setOnAction(event -> this.buttonClicked(event));
        this.button1.setOnAction(event -> this.buttonClicked(event));
        this.button2.setOnAction(event -> this.buttonClicked(event));
        this.button3.setOnAction(event -> this.buttonClicked(event));
        this.button4.setOnAction(event -> this.buttonClicked(event));
        this.button5.setOnAction(event -> this.buttonClicked(event));
        this.button6.setOnAction(event -> this.buttonClicked(event));
        this.button7.setOnAction(event -> this.buttonClicked(event));
        this.button8.setOnAction(event -> this.buttonClicked(event));
        this.button9.setOnAction(event -> this.buttonClicked(event));
    }

    @FXML
    private void buttonClicked(ActionEvent event) {
        if (event.getSource() instanceof Button) {
            String id = ((Button) event.getSource()).getId();
            if (id.equals("button0")) {
                this.calcHelper.
            } else if (id.equals("button1")) {
                this.display("1");
            } else if (id.equals("button2")) {
                this.display("2");
            } else if (id.equals("button3")) {
                this.display("3");
            }
        }

    }

    private void refreshDisplay(){
        this.display(this.calcHelper.getResult()+"");
    }

    private void display(String value) {
        this.textFieldDisplay.setText(value);
    }

}