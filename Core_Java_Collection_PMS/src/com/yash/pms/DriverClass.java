package com.yash.pms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import com.yash.pms.entity.Product;
import com.yash.pms.utils.utilities;

public class DriverClass extends utilities {

	public static void main(String[] args) {
		while (true) {
		System.out.println("********** PRODUCT MANAGEMENT SYSTEM **********");
		System.out.println("Enter the choice do you want to perform. ");
		System.out.println("1.ADD");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.View Product List");
		System.out.println("5.Search by Product Name");
		System.out.println();

		choice = input.next();
		
			switch (choice) {
			case ("add"):
				System.out.println("Enter the Product Name");
				String productName = input.next();
				System.out.println("Enter the Product Storage Location");
				String productLocation = input.next();
				System.out.println("Enter the Product quantity");
				int productQty = input.nextInt();
				System.out.println("Enter the Product price");
				int productPrice = input.nextInt();
				
				 System.out.println("Enter the Product mamifactutred Date in formta of dd/MM/yyyy");
				try {
				String productMfDateString=input.next();
				DateTimeFormatter dateTimeFormat= DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate productMfDate =LocalDate.parse(productMfDateString, dateTimeFormat); 
					Product newProduct = new Product(productId++, productName, productLocation,productQty,productPrice,productMfDate, (short) 0);
					controller.addProducts(newProduct);
				} catch (Exception e) {
					// **To do
					
					e.printStackTrace();
				}

				break;
			case "update":
				System.out.println("To update any things of the product enter the product name : ");
				String productNameToUpdate = input.next();
				if(controller.isProductExists(productList, productNameToUpdate))
				{
					System.out.println("What do you want to update");
					updateChoice = input.next();
					switch (updateChoice) {
					case "name":
						System.out.println("Enter new product Name");
						controller.UpdateProduct(productNameToUpdate, input.next(), updateChoice);
						break;
					case "location":
						System.out.println("Enter new product location");
						controller.UpdateProduct(productNameToUpdate, input.next(), updateChoice);
						break;
					case "qty":
						System.out.println("Enter new product QTY");
						controller.UpdateProduct(productNameToUpdate, input.nextInt(), updateChoice);
						break;
					case "price":
						System.out.println("Enter new product price");
						controller.UpdateProduct(productNameToUpdate, input.nextInt(), updateChoice);
						break;
							case "date":
								System.out.println("Enter new product manifactureing date");
								String productMfDateString=input.next();
								DateTimeFormatter dateTimeFormat= DateTimeFormatter.ofPattern("dd/MM/yyyy");
								LocalDate productMfDate =LocalDate.parse(productMfDateString, dateTimeFormat); 
								try {
									controller.UpdateProduct(productNameToUpdate,productMfDate);
								} catch (Exception e) {
									// **To do
									e.printStackTrace();
								}
								break;
					default:
						break;
					}
				}
				else
				{
					System.out.println("Product Name : "+productNameToUpdate+" is not found in the records");
				}
				break;
			case "delete":
				System.out.println("To delete product enter the product name : ");
				String productNameToDelete = input.next();
				controller.DeleteProduct(productNameToDelete);
				break;
			case "view":
				controller.getAllProducts();
				break;
			default:
				System.out.println(" You entered incorrect choice.");
				break;
			}
		}

	}

}
