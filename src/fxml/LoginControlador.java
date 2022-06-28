package fxml;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;

public class LoginControlador {

	@FXML
	private javafx.scene.control.TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;
	
	public void entrar() {
		System.out.println(campoEmail.getText());
		System.out.println(campoSenha.getText());
	}
}
