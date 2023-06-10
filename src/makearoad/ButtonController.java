/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makearoad;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

/**
 *
 * @author acer
 */
public class ButtonController extends TilePane {
    char c;
    MakeARoad mr;
    BorderPane dirBtns = new BorderPane();
    Button prato = new Button("PRATO");
    Button nord = new Button("Nord");
    Button ovest = new Button("Ovest");
    Button est = new Button("Est");
    Button sud = new Button("Sud");

    VBox leftBtns = new VBox();
    Button addAuto = new Button("Aggiunti Auto");
    Button moveAuto = new Button("Muovi Auto");
    Button reset = new Button("reset");
    
    ButtonController(MakeARoad mr) {
	this.mr = mr;
	dirBtns.setTop(nord);
	dirBtns.setLeft(ovest);
	dirBtns.setRight(est);
	dirBtns.setBottom(sud);
	dirBtns.setCenter(prato);
	
	prato.setOnAction((ActionEvent e) -> {
	    enableAll();
	    prato.setDisable(true);
	    c = 'p';
	});
	nord.setOnAction((ActionEvent e) -> {
	    enableAll();
	    nord.setDisable(true);
	    c = 'n';
	});
	sud.setOnAction((ActionEvent e) -> {
	    enableAll();
	    sud.setDisable(true);
	    c = 's';
	});
	est.setOnAction((ActionEvent e) -> {
	    enableAll();
	    est.setDisable(true);
	    c = 'e';
	});
	ovest.setOnAction((ActionEvent e) -> {
	    enableAll();
	    ovest.setDisable(true);
	    c = 'o';
	});
	
	reset.setOnAction((ActionEvent e) -> {
	    
	});
	
	moveAuto.setDisable(true);

	leftBtns.getChildren().addAll(addAuto, moveAuto, reset);

	this.getChildren().add(dirBtns);
	this.getChildren().add(leftBtns);
    }
    
    public void enableAll() {
	prato.setDisable(false);
	nord.setDisable(false);
	ovest.setDisable(false);
	est.setDisable(false);
	sud.setDisable(false);
    }
}
