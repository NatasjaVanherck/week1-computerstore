package be.pxl.computerstore.hardware;

public class HardDisk extends ComputerComponent{

	private int size;
	
	public HardDisk (String vendor, String name, double price, int size){
		super(vendor, name, price);
		this.size = size;
	}
	
	public String toString(){
		String output = super.toString();
		output = output + " Size = " + size;
		return output;	
	}
}
