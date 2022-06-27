package layout;

import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane {

	public TesteStackPane() {
		
		Caixa c1 = new Caixa().comTexto("1");
		
		getChildren().addAll(c1);
		
		//Pegando click do mouse
		setOnMouseClicked(e -> {
			if(e.getSceneX() > getScene().getWidth() / 2) {
				System.out.println("Direita");
			} else {
				System.out.println("Esquerda");
			}
		});
	}
}
