/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxclient5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Hailey.Jones
 */
public class FXClient5 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        StackPane root = new StackPane();
        
        Scene scene = new Scene(root, 600, 400);
        
        VBox vbox = new VBox();
        vbox.prefHeight(400.0);
        vbox.prefWidth(600.0);
        vbox.setSpacing(10.0);
        vbox.setPadding(new Insets(10.0,10.0,0.0,10.0));
        
        Label usernameLabel = new Label("Username");
        TextField usernameTextField = new TextField();
        
        Label myMessageLabel = new Label("My Message to the World");
        TextField myMessageField = new TextField();
        
        TextArea textArea = new TextArea();
        textArea.setMinHeight(200.0);
        
        vbox.getChildren().addAll(usernameLabel, usernameTextField, myMessageLabel, myMessageField, textArea);

        root.getChildren().add(vbox);

        usernameTextField.setOnKeyReleased((e)->{
            if (e.getCode() == KeyCode.ENTER) {
                if (!usernameTextField.textProperty().get().isEmpty()) {
                    textArea.setDisable(false); 
                    usernameTextField.setDisable(true);   
                    myMessageField.setDisable(false);
                }
            }
        });
     
        final MessageClient client = new MockMessageClient();
        final String myFriend = "Computer";
        final String username = usernameTextField.textProperty().get();
        MessageStore toPut = new SimpleMessageStore();

        myMessageField.setOnKeyReleased((e) -> {

            if (e.getCode() == KeyCode.ENTER) {
                if (!myMessageField.textProperty().get().isEmpty()) {
                    textArea.appendText(usernameTextField.textProperty().get() + "> ");
                    String myMessage = myMessageField.textProperty().get();
                    textArea.appendText(myMessage + "\n");
                    textArea.appendText(myFriend + "> ");
                    textArea.appendText(client.send(myMessage) + "\n");
                    toPut.store(username, myMessage);
                    myMessageField.clear();
                    toPut.dumpAll();

                }
            }

        });

 
        textArea.setDisable(true);
        textArea.setEditable(false);
        myMessageField.setDisable(true);
        
        primaryStage.setTitle("Project Dark Force I");
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
