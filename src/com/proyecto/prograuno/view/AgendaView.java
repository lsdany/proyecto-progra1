/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.prograuno.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author luisdany pernillo
 * @carne 3190-13-12063
 * @version 1.0
 */
public class AgendaView extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Scene scene  = new Scene(new VBox(), 600, 400 );
        
        MenuBar menuBar = addMenu();
        ((VBox) scene.getRoot()).getChildren().addAll(menuBar);
 
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    public MenuBar addMenu(){
        MenuBar menuBar = new MenuBar();
        Menu menu1 = new Menu("Option 1");
        
        MenuItem add = new MenuItem("add");
        menu1.getItems().add(add);
        
        menuBar.getMenus().addAll(menu1);
        return menuBar;
    }
    
    public Scene addScen(){
        
        
        return null;
    }
    
    
    public Button addButtons(){
        
        return null;
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
