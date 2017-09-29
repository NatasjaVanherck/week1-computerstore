package be.pxl.computerstore.util;

public interface Computable {
	int BTW = 21;
	
	double totalPriceExcl();
	
	default double totalPriceIncl() {
		double totalIncl = ((BTW / 100.0) + 1) * totalPriceExcl();
		return totalIncl;
	}
	
}
