package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane {

	public TesteFlowPane() {
		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		Quadrado q3 = new Quadrado();
		Quadrado q4 = new Quadrado();
		Quadrado q5 = new Quadrado();
		
		setHgap(10);	//Espaço entre as caixas, na horizontal
		setVgap(10);	//Espaço entre as caixas, na vertical
		setPadding(new Insets(10));	//Espaço entre todas direções
		
		setOrientation(Orientation.VERTICAL);	//Coloca os objetos na vertical
		setAlignment(Pos.CENTER_RIGHT);	//Alinha todos os elementos na direita
		
		getChildren().addAll(q1, q2, q3, q4, q5);
		
	}
}
