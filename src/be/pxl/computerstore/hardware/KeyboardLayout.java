package be.pxl.computerstore.hardware;

public enum KeyboardLayout {
	QWERTY("Qwerty"), AZERTY("Azerty");
	
	private String soortKeyboard;
	
	private KeyboardLayout (String soort){
		soortKeyboard = soort;
	}
	
	public String getSoortKeyboard(){
		return soortKeyboard;
	}
}
