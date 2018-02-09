package application;

import GameRulesAndCards.DeckOfCards;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class GameController {

	@FXML
	private Button viewHandButton;
	
	void handleButtonAction(ActionEvent event){
    	try {
    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Hand.fxml"));
    		Parent root2 = (Parent) fxmlLoader.load();
    		Stage stage = new Stage();
    		stage.setTitle("Hand");
    		stage.setScene(new Scene(root2));
    		stage.show();
    	} catch (Exception e){
    		System.out.println("The window cannot be opened");
    	}
    }
}
