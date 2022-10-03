package com.yash.pms.service;

import java.time.LocalDate;
import java.util.ArrayList;

import com.yash.pms.entity.Product;

public interface ProductManager {
	public void addProduct(Product products);

	public void getAllProducts();

	public int getProductByName(String productName);

	public void updateProductsName(int productId, String item);

	public void updateProductsLocation(int productId, String item);

	public void updateProductQty(int productId, int item);

	public void updateProductPrice(int productId, int item);
	
//	public void updateProductDate(int productId, LocalDate item);

	public void DeleteProduct(int productId);
}
