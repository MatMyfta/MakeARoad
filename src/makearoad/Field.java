/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makearoad;

import java.awt.event.MouseEvent;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;

/**
 *
 * @author acer
 */
public class Field extends GridPane {
    final int DIM = 10;
    ButtonController bc;
    Cell[][] caselle = new Cell[DIM][DIM];
    
    Field(ButtonController bc) {
	this.bc = bc;
	for (int i = 0; i < DIM; i++) {
	   for (int j = 0; j < DIM; j++) {
	       Cell c = new Cell(i,j,'p',bc,this);
	       this.add(c,i,j);
	       caselle[i][j] = c;
	   } 
	}
    }
}
