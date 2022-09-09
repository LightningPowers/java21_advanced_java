package application;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Order {
	private SimpleStringProperty name;
	private SimpleIntegerProperty amount;
	private SimpleFloatProperty price;

	public Order(String name, int amount, float price) {
		super();
		this.name = new SimpleStringProperty(name);
		this.amount = new SimpleIntegerProperty(amount);
		this.price = new SimpleFloatProperty(price);
	}

	public String getName() {
		return name.get();
	}

	public int getAmount() {
		return amount.get();
	}

	public float getPrice() {
		return price.get();
	}

}
