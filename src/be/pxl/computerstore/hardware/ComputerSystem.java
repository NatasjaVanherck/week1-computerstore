package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Computable;
import be.pxl.computerstore.util.TooManyPeripheralsException;

public class ComputerSystem implements Computable{
	private Processor processor;
	private ComputerCase computerCase;
	public static final int MAX_PERIPHERAL = 3;
	private Peripheral[] peripherals = new Peripheral[MAX_PERIPHERAL];

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public ComputerCase getComputerCase() {
		return computerCase;
	}

	public void setComputerCase(ComputerCase computerCase) {
		this.computerCase = computerCase;
	}

	public Peripheral[] getPeripherals() {
		return peripherals;
	}

	public void addPeripheral(Peripheral peripheral) {
		int aantalPeripherals = getNumberOfPeripherals();
		aantalPeripherals++;
		
		if (aantalPeripherals > MAX_PERIPHERAL) {
			throw new TooManyPeripheralsException("Too many");
		} else {
			for (int i = 0; i < MAX_PERIPHERAL; i++) {
				if (peripherals[i] == null) {
					peripherals[i] = peripheral;
					i = MAX_PERIPHERAL + 1;
				}
			}
		}
	}

	public void removePeripheral(String articleNumber) {
		boolean found = false;
		int count = 0;

		while (!found && count < MAX_PERIPHERAL) {
			if (peripherals[count] != null && peripherals[count].getArticleNumber().equals(articleNumber)) {
				found = true;
				peripherals[count] = null;
			}
			count++;
		}
	}

	public int getNumberOfPeripherals() {
		int teller = 0;
		for (int i = 0; i < MAX_PERIPHERAL; i++) {
			if (peripherals[i] != null) {
				teller++;
			}
		}
		return teller;
	}

	@Override
	public double totalPriceExcl() {
		double price = processor.getPrice() + computerCase.getPrice();
		for (int i = 0; i < MAX_PERIPHERAL; i++) {
			if (peripherals[i] != null) {
				price = price + peripherals[i].getPrice();
			}
		}
		return price;
	}
	
	public String toString(){
		String output = computerCase.toString() + processor.toString();
		for (int i = 0; i < MAX_PERIPHERAL; i++) {
			if (peripherals[i] != null) {
				output = output + peripherals[i].toString();
			}
		}
		
		return output;
	}
}
