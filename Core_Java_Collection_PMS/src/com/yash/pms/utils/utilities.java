package com.yash.pms.utils;
import java.util.ArrayList;
import java.util.Scanner;

import com.yash.pms.controller.ProductController;
import com.yash.pms.entity.Product;
import com.yash.pms.service.ProductManager;
import com.yash.pms.service.ProductManagerImpl;

public class utilities {

	public static String choice;
	public static String updateChoice;
	public static int productId=1;
	public static Scanner input= new Scanner(System.in);
	
	protected static ArrayList<Product> productList= new ArrayList<Product>();
	protected static String dateFormat = "dd/MM/yyyy";
	
	
	// Objects
	protected static ProductController controller= new ProductController();
	protected static ProductManagerImpl service = new ProductManagerImpl();

}
