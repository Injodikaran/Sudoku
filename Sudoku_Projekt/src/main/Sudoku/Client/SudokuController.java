package Client;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SudokuController extends Application {
	private Stage primaryStage;

	@FXML
	private List<TextField> textFieldList;

	@Override
	public void start(Stage primaryStage) {

		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Sudoku");

		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("SudokuView.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

    public static void main(String[] args) {
        launch(args);
    }

	@FXML
	public void initialize() {
		/*textField12.textProperty().addListener(new ChangeListener<String>(){

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

				System.out.println(newValue);

			}textFieldContainer.get(t).textProperty()

		});*/

		for (int i = 0; i < 3; i++) {

	        textFieldList.get(i).textProperty().addListener(new ChangeListener<String>(){

	        	@Override
				public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

					System.out.println(newValue);
				}
	        });
	        i++;
	    }
	}
}
