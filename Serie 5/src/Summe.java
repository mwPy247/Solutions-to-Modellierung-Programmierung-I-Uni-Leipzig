
public class Summe implements Operator{
	
	private double summe;
	
	public Summe() {
		;
	}
	
	public void verarbeiteWert(double wert) {
		summe += wert;
	}
	
	public double liefereErgebnis() {
		return summe;
	}
	
	public String getBezeichnung() {
		return "Summe";
	}

}
