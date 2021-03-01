package Personalverwaltung;

class Mitarbeiter {
	
	protected String name;
	
	public Mitarbeiter(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public double berechneVerdienst() {
		return 0;
	}
	
	public String toString() {
		return name;
	}
	
	

}
