package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController implements Initializable{

	@FXML private TableView<Order> table;
	@FXML private TableColumn<Order, String> nameCol;
	@FXML private TableColumn<Order, Integer> amountCol;
	@FXML private TableColumn<Order, Float> priceCol;
	
	public ObservableList<Order> orderList = FXCollections.observableArrayList(
			new Order ("Lisa", 42, 12.4f),
			new Order ("John", 41, 12.4f),
			new Order ("Sarah", 34, 12.4f)
			);
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//TestReader.readCsv();
		
		//Assigning orders from read file
		orderList.addAll(TestReader.readCsv());
		
		nameCol.setCellValueFactory(new PropertyValueFactory<Order, String>("name"));
		amountCol.setCellValueFactory(new PropertyValueFactory<Order, Integer>("amount"));
		priceCol.setCellValueFactory(new PropertyValueFactory<Order, Float>("price"));
		
		table.setItems(orderList);
	}

}
