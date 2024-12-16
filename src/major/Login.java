package major;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Login extends Application{

	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader root = new FXMLLoader(getClass().getResource("/ui/Page_login.fxml"));
		 
		
		Scene scene = new Scene(((Parent) root.load()), 1320,700);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setMaximized(false);
		primaryStage.setTitle("SHAPATARZ POS System");
		primaryStage.getIcons().add(new Image("graphic/poslogorect.jpg"));
		primaryStage.show();
		
	}
	
	public static void main(String args[]) {
		Application.launch(args);
	}
}

