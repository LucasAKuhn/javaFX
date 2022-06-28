package fxml;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;

public class LoginControlador {

	@FXML
	private javafx.scene.control.TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;
	
	public void entrar() {
		boolean emailValido = campoEmail.getText().equals("lucas.kuhn@hotmail.com");
		boolean senhaValida = campoSenha.getText().equals("123456");
		
		if(emailValido && senhaValida) {
			System.out.println("Sucesso");
		} else {
			System.out.println("Falha");
		}
	}
}
