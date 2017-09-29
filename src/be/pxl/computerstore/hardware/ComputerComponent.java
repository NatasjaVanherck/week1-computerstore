package be.pxl.computerstore.hardware;

import java.util.Random;

public abstract class ComputerComponent {
	
	private String vendor;
	private String name;
	private double price;
	private String articleNumber;
	private static int followNumber = 0;
	
	public ComputerComponent (String vendor, String name, double price){
		this.vendor = vendor;
		this.name = name;
		this.price = price;
		articleNumberGenerator();
	}
	
	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
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
	
	public String getArticleNumber() {
		return articleNumber;
	}
	
	private void articleNumberGenerator(){
		String vendor = this.vendor;
		Random rand = new Random();
		
		if(vendor.length() < 3){
			vendor = vendor + "X";
			vendor = vendor.toUpperCase();
		} else {
			vendor = vendor.substring(0, 3).toUpperCase();
		}
		
		vendor = vendor + "-";
		
		followNumber++;
		
		if(followNumber < 10){
			vendor = vendor + "0000" + followNumber;
		} else{
			if(followNumber < 100){
				vendor = vendor + "000" + followNumber;
			} else {
				if (followNumber < 1000){
					vendor = vendor + "00" + followNumber;
				} else {
					vendor = vendor + "0" + followNumber;
				}
			}
		}
		
		vendor = vendor + "-";
		vendor = vendor + (rand.nextInt(999)+1);
		this.articleNumber = vendor;
	}
	
	public String toString(){
		String output = "ArticleNumber = " + articleNumber + "\n"
				+ " Vendor = " + vendor + "\n" 
				+ " Name = " + name + "\n"
				+ " Price = " + price + "\n";
		return output;
	}
	
	public String getShortDescription(){
		return (getArticleNumber() + " * " + getName() + " * " + getPrice() + "€");
	}
}
