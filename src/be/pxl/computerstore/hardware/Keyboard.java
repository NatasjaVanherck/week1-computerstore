package be.pxl.computerstore.hardware;

public class Keyboard extends Peripheral{

	private KeyboardLayout keyboard;
	
	public Keyboard(String vendor, String name, double price, KeyboardLayout keyboard) {
		super(vendor, name, price);
		this.keyboard = keyboard;
	}

	public KeyboardLayout getKeyboard() {
		return keyboard;
	}
}
