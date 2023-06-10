/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makearoad;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

/**
 *
 * @author acer
 */
public class Lawn extends Block {
    
    Lawn(int x, int y) {
	super(x,y);
	
	BackgroundFill bf = new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY);
	super.bg = new Background(bf);
	this.setBackground(bg);
    }
    
}
