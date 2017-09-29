package be.pxl.computerstore.hardware;

public class Processor extends ComputerComponent{
	private double clockspeed;
	
	public Processor (String vendor, String name, double price, double clockspeed){
		super(vendor, name, price);
		setClockspeed(clockspeed);
	}
	
	public double getClockspeed() {
		return clockspeed;
	}

	public void setClockspeed(double clockspeed) {
		if(clockspeed < 0.7){
			this.clockspeed = 0.7;
		} else {
			this.clockspeed = clockspeed;
		}
	}
	
	public String toString(){
		String output = super.toString();
		output = output + " Clock speed = " + clockspeed + "GHz\n";
		return output;
		
	}
}
