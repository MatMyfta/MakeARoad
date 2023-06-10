/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makearoad;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

/**
 *
 * @author acer
 */
public final class Cell extends StackPane {
    Block b;
    ButtonController bc;
    Field f;
    
    Cell(int x, int y, char d, ButtonController bc, Field f) {
	this.bc = bc;
	this.f = f;
	
	if (d == 'p') 
	    b = new Lawn(x,y);
	else 
	    b = new Road(x,y,d,bc);
	
	this.getChildren().add(b);
	
	addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
	    if (bc.c == 'p')
		this.b = new Lawn(x,y);
	    else
		this.b = new Road(x,y,d,bc);
	    replaceBlock();
	});
    }
    
    public void replaceBlock() {
	this.getChildren().add(b);
    }
}
