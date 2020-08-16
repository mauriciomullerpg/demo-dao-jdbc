package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public Program() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Department obj =  new Department(1, "Livros");
		
		System.out.println(obj);

		System.out.println("--------------------------------------------------------------------------------------------------------");

		Seller seller = new Seller(21, "Bob","bob@gmail.com",new Date(), 3000.0, obj);
		System.out.println(seller);
		
		SellerDao sellerDao = DaoFactory.createSellerDao(); 
	}

}
