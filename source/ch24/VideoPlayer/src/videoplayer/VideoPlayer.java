/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoplayer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author PaulDeitel
 */
public class VideoPlayer extends Application {
   
   @Override
   public void start(Stage stage) throws Exception {
      Parent root = FXMLLoader.load(getClass().getResource("VideoPlayer.fxml"));
      
      Scene scene = new Scene(root);
      stage.setTitle("Video Player");
      stage.setScene(scene);
      stage.show();
   }

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      launch(args);
   }
   
}

