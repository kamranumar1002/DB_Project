package controller;

import com.jfoenix.controls.JFXButton;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainAdminController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private JFXButton bt_cashier;

	@FXML
	private JFXButton bt_popular;

	@FXML
	private JFXButton bt_product;

	@FXML
	private JFXButton bt_category;

	@FXML
	private JFXButton bt_customer;

	@FXML
	private JFXButton bt_logout;

	@FXML
	private AnchorPane common_pane;
	
	@FXML
    private JFXButton bt_supplier;

	@FXML
	void initialize() {
		assert bt_cashier != null : "fx:id=\"bt_cashier\" was not injected: check your FXML file 'Admin_panel.fxml'.";		
		assert bt_popular != null : "fx:id=\"bt_popular\" was not injected: check your FXML file 'Admin_panel.fxml'.";		
		assert bt_product != null : "fx:id=\"bt_product\" was not injected: check your FXML file 'Admin_panel.fxml'.";		
		assert bt_category != null : "fx:id=\"bt_category\" was not injected: check your FXML file 'Admin_panel.fxml'.";
		assert bt_customer != null : "fx:id=\"bt_customer\" was not injected: check your FXML file 'Admin_panel.fxml'.";
		assert bt_logout != null : "fx:id=\"bt_logout\" was not injected: check your FXML file 'Admin_panel.fxml'.";
		assert common_pane != null : "fx:id=\"common_pane\" was not injected: check your FXML file 'Admin_panel.fxml'.";
		assert bt_supplier != null : "fx:id=\"bt_supplier\" was not injected: check your FXML file 'Admin_panel.fxml'.";		
        

		AnchorPane pane = null;
		try {
			pane = FXMLLoader.load(getClass().getResource("/ui/admin_product.fxml"));
		} catch (IOException e) {			
			e.printStackTrace();
		}
		common_pane.getChildren().add(pane);
		
		bt_product.setDisable(true);
	}
	
	public class LoginPg extends Application {

		@Override
		public void start(Stage primaryStage) throws Exception {
			Parent root = FXMLLoader.load(getClass().getResource("/ui/Page_login.fxml"));

			Scene scene = new Scene(root, 1320, 700);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Cashier");			
			primaryStage.setResizable(false);
			primaryStage.setMaximized(false);
			primaryStage.show();
		}
	}

	@FXML
	void onCashierAction(ActionEvent event) {

		AnchorPane pane = null;
		try {
			pane = FXMLLoader.load(getClass().getResource("/ui/Admin_cashier.fxml"));
		} catch (IOException e) {			
			e.printStackTrace();
		}
		common_pane.getChildren().clear();
		common_pane.getChildren().add(pane);
		
		bt_cashier.setDisable(true);		
		bt_popular.setDisable(false);		
		bt_product.setDisable(false);		
		bt_category.setDisable(false);
		bt_customer.setDisable(false);
		bt_logout.setDisable(false);
		bt_supplier.setDisable(false);		
	}
	
	@FXML
	void onProductAction(ActionEvent event) {
		AnchorPane pane = null;
		try {
			pane = FXMLLoader.load(getClass().getResource("/ui/Admin_product.fxml"));
		} catch (IOException e) {			
			e.printStackTrace();
		}
		common_pane.getChildren().clear();
		common_pane.getChildren().add(pane);
		
		bt_product.setDisable(true);		
		bt_popular.setDisable(false);		
		bt_cashier.setDisable(false);		
		bt_category.setDisable(false);
		bt_customer.setDisable(false);
		bt_logout.setDisable(false);
		bt_supplier.setDisable(false);		
	}
	
	@FXML
	void onCategoryAction(ActionEvent event) {

		AnchorPane pane = null;
		try {
			pane = FXMLLoader.load(getClass().getResource("/ui/Admin_category.fxml"));
		} catch (IOException e) {			
			e.printStackTrace();
		}
		common_pane.getChildren().clear();
		common_pane.getChildren().add(pane);
		
		bt_category.setDisable(true);		
		bt_popular.setDisable(false);		
		bt_cashier.setDisable(false);		
		bt_product.setDisable(false);
		bt_customer.setDisable(false);
		bt_logout.setDisable(false);
		bt_supplier.setDisable(false);		
	}
	
	@FXML
	void onCustomerAction(ActionEvent event) {

		AnchorPane pane = null;
		try {
			pane = FXMLLoader.load(getClass().getResource("/ui/Admin_customer.fxml"));
		} catch (IOException e) {			
			e.printStackTrace();
		}
		common_pane.getChildren().clear();
		common_pane.getChildren().add(pane);
		
		bt_customer.setDisable(true);		
		bt_popular.setDisable(false);		
		bt_cashier.setDisable(false);		
		bt_product.setDisable(false);
		bt_category.setDisable(false);
		bt_logout.setDisable(false);
		bt_supplier.setDisable(false);		
	}
			
									
												
			
	
	@FXML
    void onSupplierAction(ActionEvent event) {

		AnchorPane pane = null;
		try {
			pane = FXMLLoader.load(getClass().getResource("/ui/Admin_supplier.fxml"));
		} catch (IOException e) {			
			e.printStackTrace();
		}
		common_pane.getChildren().clear();
		common_pane.getChildren().add(pane);
		
		bt_supplier.setDisable(true);		
		bt_popular.setDisable(false);		
		bt_cashier.setDisable(false);
		bt_customer.setDisable(false);
		bt_product.setDisable(false);		
		bt_category.setDisable(false);
		bt_logout.setDisable(false);		
    }
	
	@FXML
	void onPopularAction(ActionEvent event) {

		AnchorPane pane = null;
		try {
			pane = FXMLLoader.load(getClass().getResource("/ui/Admin_popular_item.fxml"));
		} catch (IOException e) {			
			e.printStackTrace();
		}
		common_pane.getChildren().clear();
		common_pane.getChildren().add(pane);
		
		bt_popular.setDisable(true);		
		bt_supplier.setDisable(false);		
		bt_cashier.setDisable(false);
		bt_customer.setDisable(false);
		bt_product.setDisable(false);		
		bt_category.setDisable(false);
		bt_logout.setDisable(false);		
	}
	
		@FXML
		void onLogoutAction(ActionEvent event) {			
			try {
				new LoginPg().start((Stage) bt_logout.getScene().getWindow());
			} catch (Exception e) {				
				e.printStackTrace();
			}
		}
}