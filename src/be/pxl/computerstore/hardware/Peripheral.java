package be.pxl.computerstore.hardware;

public abstract class Peripheral extends ComputerComponent{

	public Peripheral (String vendor, String name, double price){
		super(vendor, name, price);
	}
	
	public String getShortDescription(){
		String className =  this.getClass().getSimpleName();
		return (getArticleNumber() + " * " + className + " * " + getName() + " * " + getPrice() + "€");
	}
}
