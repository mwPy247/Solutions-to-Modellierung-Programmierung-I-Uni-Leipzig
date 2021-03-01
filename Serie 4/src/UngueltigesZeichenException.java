
public class UngueltigesZeichenException extends Exception {
	
	public UngueltigesZeichenException() {
		super("Ung�ltiges Zeichen");
	}
	
	public UngueltigesZeichenException(String dateiname, int zeilennummer) {
		super("Ung�ltiges Zeichen in " + dateiname + " Zeile " + zeilennummer);
	}

}
