package org.khtn.group12.cgg.admintool.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class MainRunApplication extends Application {
	private static Stage state;
	public static final String PATH_IMG_APP = "/org/khtn/group12/cgg/admintool/images/fat.jpg";

	public static Stage getPrimaryStage() {
		return MainRunApplication.state;
	}

	public void setPrimaryStage(Stage stage) {
		MainRunApplication.state = stage;
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			setPrimaryStage(primaryStage);
			CGGAdminTool controller = new CGGAdminTool();
			FXMLLoader fxmlLoader = new FXMLLoader(
					getClass().getResource("/org/khtn/group12/cgg/admintool/view/CGGAdminTool.fxml"));
			fxmlLoader.setController(controller);
			Parent root = fxmlLoader.load();
			primaryStage.setTitle("CGG Addmin Tool");
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();

			primaryStage.getIcons().add(new Image(PATH_IMG_APP));

			setPrimaryStage(primaryStage);
		} catch (Exception e) {
			e.printStackTrace();
			primaryStage.close();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
