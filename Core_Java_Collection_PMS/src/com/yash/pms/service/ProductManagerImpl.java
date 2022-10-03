package com.yash.pms.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import com.yash.pms.entity.Product;
import com.yash.pms.utils.utilities;

public class ProductManagerImpl extends utilities implements ProductManager {

	@Override
	public void addProduct(Product products) {
		productList.add(products);
		
	}

	@Override
	public void getAllProducts() {
		 for (int i = 0; i < productList.size(); i++) {
			 if(productList.get(i).getIsProductDeleted() ==0 )
			 {
				 System.out.print(productList.get(i).getProductId()+" || "+ productList.get(i).getProductName()+" || "+
						 productList.get(i).getQty()+" || "+ productList.get(i).getPrice()+" || "+productList.get(i).getIsProductDeleted()); 
			 }
			
		}
		 System.out.println();
		
	}

	@Override
	public int getProductByName(String productName) {
		
		for (int i = 0; i < productList.size(); i++) {
			if(productList.get(i).getProductName().equalsIgnoreCase(productName))
			{
				return productList.get(i).getProductId();
			}
		}
		
		return 0;
	}

	
	
	@Override
	public void DeleteProduct(int productId) {
		
		for (int i = 0; i < productList.size(); i++) {
			if(productList.get(i).getProductId()== productId)
			{
				productList.get(i).setIsProductDeleted((short) 1);
			}
		}
	}

	@Override
	public void updateProductsName(int productId, String item) {
		
		for (int i = 0; i < productList.size(); i++) {
			if(productList.get(i).getProductId()== productId)
			{
				productList.get(i).setProductName(item);
			}
		}
	}

	@Override
	public void updateProductsLocation(int productId, String item) {
		for (int i = 0; i < productList.size(); i++) {
			if(productList.get(i).getProductId()== productId)
			{
				productList.get(i).setStorageLocation(item);
			}
		}
		
	}

	@Override
	public void updateProductQty(int productId, int item) {
		for (int i = 0; i < productList.size(); i++) {
			if(productList.get(i).getProductId()== productId)
			{
				productList.get(i).setQty(item);
			}
		}
		
	}

	@Override
	public void updateProductPrice(int productId, int item) {
		for (int i = 0; i < productList.size(); i++) {
			if(productList.get(i).getProductId()== productId)
			{
				productList.get(i).setPrice(item);
			}
		}
		
	}

//	@Override
//	public void updateProductDate(int productId, LocalDate item) {
//		for (int i = 0; i < productList.size(); i++) {
//			if(productList.get(i).getProductId()== productId)
//			{
//				productList.get(i).setManifactureDate(item);
//			}
//		}
//		
//	}
	
	
	

}
