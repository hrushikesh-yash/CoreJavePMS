package com.yash.pms.controller;

import java.time.LocalDate;
import com.yash.pms.entity.Product;
import com.yash.pms.utils.utilities;

public class ProductController extends utilities {

	public void addProducts(Product product) {
		service.addProduct(product);
		// return false;
	}

	public void getAllProducts() {
		service.getAllProducts();
	}

	public int getProductByName(String productName) {

		return service.getProductByName(productName);
	}

	public void UpdateProduct(String ProductName, String item, String choice) {
		if (choice.equalsIgnoreCase("name")) {
			service.updateProductsName(getProductByName(ProductName), item);
		} else if (choice.equalsIgnoreCase("location")) {
			service.updateProductsLocation(getProductByName(ProductName), item);
		}

	}

	public void UpdateProduct(String ProductName, int item, String choice) {
		if (choice.equalsIgnoreCase("qty")) {
			service.updateProductQty(getProductByName(ProductName), item);
		} else if (choice.equalsIgnoreCase("price")) {
			service.updateProductPrice(getProductByName(ProductName), item);
		}
	}

//	public void UpdateProduct(String ProductName, LocalDate item) {
//		service.updateProductDate(getProductByName(ProductName), item);
//
//	}

	public void DeleteProduct(String productName) {
		service.DeleteProduct(getProductByName(productName));
	}

}
