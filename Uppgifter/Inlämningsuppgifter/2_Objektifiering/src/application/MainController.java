package application;

import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController implements Initializable{

	//Connect to table
	@FXML private TableView<Order> tableView;
	@FXML private TableColumn<Order, LocalDate> orderDateCol;
	@FXML private TableColumn<Order, String> regionCol;
	@FXML private TableColumn<Order, String> rep1Col;
	@FXML private TableColumn<Order, String> rep2Col;
	@FXML private TableColumn<Order, String> itemCol;
	@FXML private TableColumn<Order, Integer> unitsCol;
	@FXML private TableColumn<Order, Float> unitCostCol;
	@FXML private TableColumn<Order, Float> totalCol;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		orderDateCol.setCellValueFactory(new PropertyValueFactory<Order, LocalDate>("orderDate"));
		regionCol.setCellValueFactory(new PropertyValueFactory<Order, String>("region"));
		rep1Col.setCellValueFactory(new PropertyValueFactory<Order, String>("rep1"));
		rep2Col.setCellValueFactory(new PropertyValueFactory<Order, String>("rep2"));
		itemCol.setCellValueFactory(new PropertyValueFactory<Order, String>("item"));
		unitsCol.setCellValueFactory(new PropertyValueFactory<Order, Integer>("units"));
		unitCostCol.setCellValueFactory(new PropertyValueFactory<Order, Float>("unitCost"));
		totalCol.setCellValueFactory(new PropertyValueFactory<Order, Float>("total"));
		
		//load placeholder data
		tableView.setItems(getOrders());
	}

	private ObservableList<Order> getOrders() {
		
		ObservableList<Order> orderList = FXCollections.observableArrayList();
		
		//Dummy data, will add data via reading file later
		orderList.add(new Order(LocalDate.of(2002, Month.APRIL, 24), "South", "Andrea", "Camilla", "Papers", 10, 21.99f, 44.26f));
		orderList.add(new Order(LocalDate.of(2002, Month.APRIL, 24), "South", "Andrea", "Camilla", "Papers", 10, 21.99f, 44.26f));
		
		System.out.println(orderList.size());
		
		return orderList;
	}
	
	//Reads data from table and creates a new order
//	private Order addOrder() {
//		
//		//Order newOrder = new Order();
//		
//		return null;
//	}
}


	
