package application;

import java.io.IOException;

import GameRulesAndCards.DeckOfCards;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController {

    @FXML 
    private Button playGameButton;

    @FXML
    void handleButtonAction(ActionEvent event){
    	DeckOfCards d = new DeckOfCards();
    	d.shuffleDeck();
    	try {
    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Game.fxml"));
    		Parent root1 = (Parent) fxmlLoader.load();
    		Stage stage = new Stage();
    		stage.setTitle("Game");
    		stage.setScene(new Scene(root1));
    		stage.show();
    	} catch (Exception e){
    		System.out.println("The window cannot be opened");
    	}
    }
    
}
