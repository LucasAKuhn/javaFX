package basico;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
			
		javafx.scene.control.Button botaoA = new javafx.scene.control.Button("A");
		javafx.scene.control.Button botaoB = new javafx.scene.control.Button("B");
		javafx.scene.control.Button botaoC = new javafx.scene.control.Button("C");
		
		VBox box = new VBox();
		box.getChildren().add(botaoA);		
		box.getChildren().add(botaoB);		
		box.getChildren().add(botaoC);		
		
		Scene unicaCena = new Scene(box);
		
		primaryStage.setScene(unicaCena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
