package application;

import java.util.Date;

import model.entity.Department;
import model.entity.Seller;

public class Program {
	public static void main(String[] args) {
		
		Department obj = new Department(1, "Book");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);
		
		System.out.println(seller);
	}
}
