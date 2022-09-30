/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package anonymoushandlerdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author usu2dam
 */
public class AnonymousHandlerDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(10);
        Button btnNew = new Button("New");
        Button btnOpen = new Button("Open");
        Button btnSave = new Button("Save");
        Button btnPrint = new Button("Print");
        hBox.getChildren().addAll(btnNew, btnOpen, btnSave, btnPrint);
        
        btnNew.setOnAction((ActionEvent e) -> 
        {
            System.out.println("Nuevo Proceso");
        }
        );
        
        btnOpen.setOnAction((ActionEvent e) -> 
        {
            System.out.println("Abrir proceso");
        }
        );
        
        btnSave.setOnAction((ActionEvent e) -> 
        {
            System.out.println("Guardar proceso");
        }
        );
        
        btnPrint.setOnAction((ActionEvent e) -> 
        {
            System.out.println("Imprimir proceso");
        }
        );
        
        
        
        Scene scene = new Scene(hBox, 300, 50);

        primaryStage.setTitle("AnonymousHandlerDemo");
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
