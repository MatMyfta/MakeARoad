/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makearoad;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author acer
 */
class KeyController implements EventHandler<KeyEvent> {

    MakeARoad mk;

    public KeyController(MakeARoad mk) {
        this.mk = mk;
    }

    @Override
    public void handle(KeyEvent event) {
        String s = event.getCharacter();
        Button targetButton = null;
        switch (s) {
            case "N":
            case "n":
                targetButton = mk.bc.nord;
                break;
            case "S":
            case "s":
                targetButton = mk.bc.sud;
                break;
            case "E":
            case "e":
                targetButton = mk.bc.est;
                break;
            case "O":
            case "o":
                targetButton = mk.bc.ovest;
                break;
            case "P":
            case "p":
                targetButton = mk.bc.prato;
                break;  
	    default: break;
        }
	mk.bc.enableAll();
	targetButton.setDisable(true);
    }

}
