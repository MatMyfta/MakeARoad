/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makearoad;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author acer
 */
public class MakeARoad extends Application {
    
    Field field;
    ButtonController bc;
    
    @Override
    public void start(Stage primaryStage) {
	Button btn = new Button();
	btn.setText("Say 'Hello World'");
	btn.setOnAction((ActionEvent event) -> {
	    System.out.println("Hello World!");
	});
	
	VBox root = new VBox();
	
	KeyController kc = new KeyController(this);
	bc = new ButtonController(this);
	field = new Field(bc);
        root.addEventHandler(KeyEvent.KEY_TYPED, kc);
	
	root.getChildren().add(field);
	root.getChildren().add(bc);
	
	Scene scene = new Scene(root, 500, 600);
	
	primaryStage.setTitle("Hello World!");
	primaryStage.setScene(scene);
	primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	launch(args);
    }
    
}
