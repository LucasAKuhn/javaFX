package layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Quadrado extends Rectangle {

private static int i = 0;
	
	private String[] cores = {
			"black", "#39aac6", "#aabbcc",
			"#fb750e", "red", "f9060e"
	};
	
	public Quadrado() {
		this(100, 100);
	}
	
	public Quadrado(int largura, int altura) {
		
		setWidth(largura);
		setHeight(altura);
		
		setFill(Color.web(cores[i]));
		
		i++;
		if(i == 6) i = 0;
	}
}
