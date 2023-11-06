package com.model;

public class Laptop {
	private String model;
	private String year;
	private int price;
	Charger charger; //Dependency Injection (DI)
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String model, String year, int price, Charger charger) {
		super();
		this.model = model;
		this.year = year;
		this.price = price;
		this.charger = charger;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Charger getCharger() {
		return charger;
	}
	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", year=" + year + ", price=" + price + ", charger=" + charger + "]";
	}
	
	
	
	

}
