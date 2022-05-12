package testCSS;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.shape.*;

public class testCSS extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		HBox hBox = new HBox(5);
		Scene scene = new Scene(hBox, 350, 200);
		scene.getStylesheets().add("mystyle.css");
		
		//small things
		Pane pane1 = new Pane();
//		pane1.getStylesheets().add("mystyle.css");//only this pane gets modified
		Circle c1 = new Circle(50,50,30);
		Circle c2 = new Circle(150,50,30);
		Circle c3 = new Circle(100,100,30);
		
		pane1.getChildren().addAll(c1,c2,c3);
		pane1.getStyleClass().add("border");
		
		
		
		
		//mid things
		Button btHi = new Button("HI!");
		Button btHello = new Button("Hello");
		Button btClose = new Button("Close");
		//panes
		Pane pane = new Pane(btHi);
		VBox vBox = new VBox();
		HBox main = new HBox();
		Pane circles = new Pane();
		//visual
		circles.setPrefHeight(300);
		c1.getStyleClass().add("plaincircle");
		c2.getStyleClass().addAll("plaincircle", "circleborder");
		c3.setId("redcircle");
//		
		Pane pane2 = new Pane();
		Circle c4 = new Circle(100,100,30);
		c4.getStyleClass().addAll("circleborder","plaincircle");
		c4.setId("greencircle");
		pane2.getChildren().add(c4);
		pane2.getStyleClass().add("border");
		
//		pane.getStyleClass().add("border");
//		//set panes
//		circles.getChildren().addAll(c1,c2,c3);
//		vBox.getChildren().addAll(btHello, pane, btClose);
//		hBox.getChildren().addAll(circles, vBox);
		//logical
		hBox.getChildren().addAll(pane1,pane2);
		//stage
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public static void main (String[] args) {
		launch(args);
	}
}
