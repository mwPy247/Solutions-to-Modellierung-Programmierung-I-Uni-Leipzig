
public class Durchschnitt implements Operator{
	
	private int anzahlSummanden;
	private double summe;
	
	public Durchschnitt() {
		;
	}
	
	public void verarbeiteWert(double wert) {
		summe += wert;
		anzahlSummanden += 1;
	}
	
	public double liefereErgebnis() {
		return summe/anzahlSummanden;
	}
	
	public String getBezeichnung() {
		return "Durchschnitt";
	}

}
