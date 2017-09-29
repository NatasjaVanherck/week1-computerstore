package be.pxl.computerstore.util;

@SuppressWarnings("serial")
public class TooManyPeripheralsException extends RuntimeException {
	public TooManyPeripheralsException(){
		super();
	}
	
	public TooManyPeripheralsException(String message){
		super(message);
	}
	
	public TooManyPeripheralsException(String message, Throwable cause){
		super(message, cause);
	}
	
	public TooManyPeripheralsException(Throwable cause){
		super(cause);
	}

}
