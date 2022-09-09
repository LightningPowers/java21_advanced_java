package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestReader {

	private static String filePath = "src/application/test_table.csv";
//	private static String filePath = "src/application/sample.csv";

	
	//Reads and parses Csv file and returns an Arraylist with the order objects
	public static ArrayList<Order> readCsv() {

		ArrayList<Order> orderList = new ArrayList<Order>();
		
		Scanner sc;
		try {
			sc = new Scanner(new File(filePath));

			int iteration = 0;

			String name = null;
			int amount = 0;
			float price = 0;
			
			//Loops through each row of the .csv file
			while (sc.hasNextLine()) {

				String[] line = sc.nextLine().split(",", 3);

				if (iteration != 0) {
					name = line[0];
					amount = Integer.parseInt(line[1]);
					price = Float.parseFloat(line[2]);
				}
				//Creating and adding a new order to the list
				Order newOrder = new Order(name, amount, price);
				orderList.add(newOrder);
				
				iteration++;
				System.out.println(name + " " + amount + " " + price);
			}

			sc.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return orderList;
	}

}
