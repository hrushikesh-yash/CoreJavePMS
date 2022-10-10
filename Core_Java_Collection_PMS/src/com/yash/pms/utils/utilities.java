package com.yash.pms.utils;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import com.yash.pms.controller.ProductController;
import com.yash.pms.entity.Product;
import com.yash.pms.service.ProductManager;
import com.yash.pms.service.ProductManagerImpl;

public class utilities {

	public static int choice;
	public static int updateChoice;
	public static int productId=1;
	public static Scanner input= new Scanner(System.in);
	
	protected static LinkedList<Product> productList= new LinkedList<Product>();
	protected static String dateFormat = "dd/MM/yyyy";
	
	
	// Objects
	protected static ProductController controller= new ProductController();
	protected static ProductManagerImpl service = new ProductManagerImpl();

}
