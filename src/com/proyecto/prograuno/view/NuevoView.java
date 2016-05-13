/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.prograuno.view;

import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author luisdany pernillo
 * @carne 3190-13-12063
 * @version 1.0
 */
public class NuevoView extends AgendaView{
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Scene scene  = addScen();
        
        MenuBar menuBar = addMenu();
        ((VBox) scene.getRoot()).getChildren().addAll(menuBar);
 
        primaryStage.setScene(scene);
        primaryStage.setTitle("Agenda");
        primaryStage.show();
        
    }
    
    @Override
    public Scene addScen(){
        
        Scene scene  = new Scene(new VBox(), 800, 400 );
        
        
        
        return scene;
    }
    
    public static void main(String[] args){
        launch(args);
    }
    
}
