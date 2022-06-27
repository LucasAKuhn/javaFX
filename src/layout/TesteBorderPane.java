package layout;

import javafx.scene.layout.BorderPane;

public class TesteBorderPane extends BorderPane {

	public TesteBorderPane() {
		Caixa c1 = new Caixa().comTexto("Topo");
		setTop(c1);
		
		Caixa c2 = new Caixa().comTexto("Topo");
		setLeft(c2);
		
		Caixa c3 = new Caixa().comTexto("Topo");
		setRight(c3);
		
		Caixa c4 = new Caixa().comTexto("Topo");
		setBottom(c4);
		
		Caixa c5 = new Caixa().comTexto("Area central");
		setCenter(c5);
	}
}
