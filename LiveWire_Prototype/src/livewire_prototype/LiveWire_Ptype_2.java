/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livewire_prototype;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Chris Aiello G7244
 */
public class LiveWire_Ptype_2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        UserDatabase udb = new UserDatabase();
        Label title = new Label("Please Fill out the following user information to Create an account\nOr click 'Skip' to login");
        Label L1C = new Label("Create a Username: ");
        TextField tf1c = new TextField();
        Label L2C = new Label("Create a Password: ");
        TextField tf2c = new TextField();
        Button btn4 = new Button("Skip");
        btn4.setOnAction(eve->new NewStage());
        
        Button btn3 = new Button("Create Account");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String input_name = tf1c.getText();
                String input_password = tf2c.getText();
                udb.createAccount(input_name, input_password);
                btn4.setText("Continue");
                System.out.println("Account Created! Thanks "+input_name+"Please click 'continue' to advace to login Screen");
                tf1c.clear();
                tf2c.clear();
            }
        });
        
        FlowPane F1 = new FlowPane(L1C, tf1c);
        FlowPane F2 = new FlowPane(L2C, tf2c);
        FlowPane F3 = new FlowPane(btn3, btn4);
        btn4.setTranslateX(20);
        Group G1 = new Group(title, F1, F2, F3);
        F1.setTranslateY(35);
        F2.setTranslateY(70);
        btn3.setTranslateY(150);
        btn4.setTranslateY(150);
        
        Scene scene = new Scene(G1, 800, 800);
        
        primaryStage.setTitle("Welcome to LIVEWIRE!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    class NewStage {
    
    NewStage(){
        Stage subStage = new Stage();
        subStage.setTitle("Login");
        Label title = new Label("Please Fill out the following to log in");
        Label L1 = new Label("Username: ");
        TextField tf1 = new TextField();
        Label L2 = new Label("Password: ");
        TextField tf2 = new TextField();
        Button btn2 = new Button("List Users");
        btn2.setTranslateX(50);
        btn2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                .toString();
            }
        });
        
        Button btn = new Button();
        btn.setText("Login");
        btn.setOnAction(new EventHandler<ActionEvent>(){
        @Override
        public void handle(ActionEvent event){
            String UI = tf1.getText();
            String PI = tf2.getText();
            boolean val = udb.validate(UI, PI);
            if (val==true){
            System.out.println("Firmly Logged in as: "+UI);
            }
            else{
                System.out.println("there is an error");
            }
            tf1.clear();
            tf2.clear();
            System.out.println("if you wish to interact more \nor log in as a different user \nuse the TAB key");
            }
        });
        StackPane t = new StackPane(title);
        FlowPane F1 = new FlowPane(L1, tf1);
        FlowPane F2 = new FlowPane(L2, tf2);
        Group G1 = new Group(t, F1, F2, btn, btn2);
        F1.setTranslateY(35);
        F2.setTranslateY(70);
        btn.setTranslateY(150);
        btn2.setTranslateY(150);
        G1.setTranslateY(10);
        StackPane root = new StackPane(G1);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 700, 700);
        
        subStage.setScene(scene);
        subStage.show();
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
