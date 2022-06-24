package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

	private int contador = 0;
	
	//	Criando metodo para, ao ser negativo ficar vermelho, e ao ser positivo ficar verde
	private void atualizarLabelNumero(Label label) {
		label.setText(Integer.toString(contador));
		
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");
		
		if(contador > 0) {
			label.getStyleClass().add("verde");
		} else if (contador < 0) {
			label.getStyleClass().add("vermelho");			
		}
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");	//Linkando com CSS
		
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");	//Linkando com CSS
		
		Button botaoDecremento = new Button("-");
		botaoDecremento.getStyleClass().add("botoes");
		// Criando funcao DECREMENTO
		botaoDecremento.setOnAction(e -> {
			contador--;
			atualizarLabelNumero(labelNumero);
		});
		
		Button botaoIncremento = new Button("+");
		botaoIncremento.getStyleClass().add("botoes");
		// Criando funcao INCREMENTO
		botaoIncremento.setOnAction(e -> {
			contador++;
			atualizarLabelNumero(labelNumero);
		});
		
		//Colocando botoes lado a lado
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);	//Centralizando
		boxBotoes.setSpacing(10);	// Espaçamento		
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		
		VBox boxConteudo = new VBox();
		boxConteudo.getStyleClass().add("conteudo");
		//boxConteudo.getStyleClass().add("conteudo"); //	Linkando com CSS	
		boxConteudo.setSpacing(10);	// Espaçamento	
		boxConteudo.setAlignment(Pos.CENTER);	//Centralizando
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);

		// Passando CSS
		String caminhoDoCss = getClass()
				.getResource("/basico/Contador.css").toExternalForm();
		
		Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
		cenaPrincipal.getStylesheets().add(caminhoDoCss);
		cenaPrincipal.getStylesheets()
			.add("https://fonts.googleapis.com/css2?family=League+Gothic&family=Oswald");
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
