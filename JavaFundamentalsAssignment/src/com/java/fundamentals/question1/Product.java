package com.java.fundamentals.question1;

public class Product {
	private int id;
	private String name;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public static void main(String args[]) {
		Product product=new Product();
		product.setId(1);
		product.setName("Mouse");
		product.setPrice(500.00);
		System.out.println("Product id: "+product.getId() + "\nProduct name: "+ product.getName() + "\nProduct price: "+ product.getPrice());
	}
	

}
