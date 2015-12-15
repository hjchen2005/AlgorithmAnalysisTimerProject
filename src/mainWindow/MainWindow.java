package mainWindow;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
//import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
//import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import kSelection.KSelectionTest;
import mergeSort.MergeSortTest;
import quickSort.QuickSortTest;
import randomizedSelection.RandomizedDiv3Test;
import randomizedSelection.div5.RandomizedDiv5Test;
import tournamentTree.TournamentTest;

public class MainWindow extends Application{
	private static String[] args;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
		
	}
	
	Stage window = new Stage();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		args = new String[0];
		window=primaryStage;
        window.setTitle("Algorithm Project");
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        //Canvas canvas = new Canvas();
        Button testMergeSort = new Button();
        testMergeSort.setText("Test - Merge Sort");
        testMergeSort.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				MergeSortTest.main(args);
			}}); // end setOnAction
        
        Button testQuickSort = new Button("Test - Quick Sort");
        testQuickSort.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				QuickSortTest.main(args);
			}});
        
        Button testTournamentTree = new Button ("Test - Tournament Tree");
        testTournamentTree.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				TournamentTest.main(args);
			}});
        
        Button testKSelection = new Button ("Test - K-Selection");
        testKSelection.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				KSelectionTest.main(args);
			}});
        
        Button testRandomizedDiv3 = new Button ("Test - Randomized Div3");
        testRandomizedDiv3.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				RandomizedDiv3Test.main(args);
			}});
        
        Button testRandomizedDiv5 = new Button ("Test - Randomized Div5");
        testRandomizedDiv5.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				RandomizedDiv5Test.main(args);
			}});
        
        
        GridPane.setConstraints(testMergeSort,0,0);
        GridPane.setConstraints(testQuickSort,0,1);
        GridPane.setConstraints(testTournamentTree,0,2);
        GridPane.setConstraints(testKSelection,0,3);
        GridPane.setConstraints(testRandomizedDiv3,0,4);
        GridPane.setConstraints(testRandomizedDiv5,0,5);
        gridPane.getChildren().addAll(testMergeSort,testQuickSort,testTournamentTree,testKSelection, testRandomizedDiv3,testRandomizedDiv5);
        GridPane.setValignment(gridPane.getChildren().get(1), VPos.CENTER);
        gridPane.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(gridPane,300,400,Color.BLACK);
        window.setScene(scene);
        window.show();
	}

}
