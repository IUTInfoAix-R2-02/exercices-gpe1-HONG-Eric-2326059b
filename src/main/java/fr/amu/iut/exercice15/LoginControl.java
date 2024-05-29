package fr.amu.iut.exercice15;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import java.util.regex.Pattern;

public class LoginControl extends GridPane {
    @FXML
    private TextField userId;

    @FXML
    private PasswordField pwd;
    private Button cancelButton;
    @FXML
    private Button okButton;


    private void createBindings() {
        // Binding to make the password field not editable if the user ID length is less than 6
        pwd.editableProperty().bind(Bindings.createBooleanBinding(
                () -> userId.getText().length() >= 6,
                userId.textProperty()
        ));

        // Binding to make the cancel button not clickable if both fields are empty
        cancelButton.disableProperty().bind(Bindings.createBooleanBinding(
                () -> userId.getText().isEmpty() && pwd.getText().isEmpty(),
                userId.textProperty(),
                pwd.textProperty()
        ));

        // Binding to make the ok button not clickable until the password has at least 8 characters,
        // and contains at least one uppercase letter and one digit
        BooleanBinding validPasswordBinding = Bindings.createBooleanBinding(
                () -> {
                    String password = pwd.getText();
                    return password.length() >= 8 &&
                            Pattern.compile("[A-Z]").matcher(password).find() &&
                            Pattern.compile("\\d").matcher(password).find();
                },
                pwd.textProperty()
        );

        okButton.disableProperty().bind(validPasswordBinding.not());
    }

    @FXML
    private void okClicked() {
        System.out.print(userId.getText() + " ");
        for (char c : pwd.getText().toCharArray()) {
            System.out.print("*");
        }
        System.out.println();
    }

    @FXML
    private void cancelClicked() {
        userId.setText("");
        pwd.setText("");
    }
}