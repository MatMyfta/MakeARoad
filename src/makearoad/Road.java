/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makearoad;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author acer
 */
public class Road extends Block {
    char dir;
    ButtonController bc;
    
    Road(int x, int y, char d, ButtonController bc) {
	super(x,y);
	this.dir = d;
	this.bc = bc;
	
	BackgroundFill bf = new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY);
	super.bg = new Background(bf);
	this.setBackground(bg);
	
	this.getChildren().add(new Direction());
	
	addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
	    this.getChildren().add(new Auto(5));
	    bc.addAuto.setDisable(true);
	    bc.moveAuto.setDisable(false);
	});
    }
    
    class Direction extends BorderPane {
	Circle cir;
	
	Direction() {
	    cir = new Circle(4);
	    cir.setStroke(Color.YELLOW);
	    FlowPane f;
	    switch (dir) {
		case 'n' : 
		    f = new FlowPane(Orientation.HORIZONTAL); 
		    f.setAlignment(Pos.CENTER);
		    f.getChildren().add(cir);
		    this.setTop(f); break;
		case 'e' : 
		    f = new FlowPane(Orientation.VERTICAL); 
		    f.setAlignment(Pos.CENTER);
		    f.getChildren().add(cir);
		    this.setRight(f); break;
		case 's' : 
		    f = new FlowPane(Orientation.HORIZONTAL); 
		    f.setAlignment(Pos.CENTER);
		    f.getChildren().add(cir);
		    this.setBottom(f); break;
		case 'o' : 
		    f = new FlowPane(Orientation.VERTICAL); 
		    f.setAlignment(Pos.CENTER);
		    f.getChildren().add(cir);
		    this.setLeft(f); break;
		default : break;
	    }
	}
    }
}
