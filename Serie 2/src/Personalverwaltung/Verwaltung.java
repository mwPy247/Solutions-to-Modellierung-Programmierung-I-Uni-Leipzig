package Personalverwaltung;

class Verwaltung {

	private Mitarbeiter[] mitarbeiter;
	
	public Verwaltung(int anzahlMitarbeiter) {
		mitarbeiter = new Mitarbeiter[anzahlMitarbeiter];
	}
	
	public Mitarbeiter[] getMitarbeiter() {
		return mitarbeiter;
	}

	public boolean addMitarbeiter(Mitarbeiter neuerMitarbeiter) {
		int anzahlMitarbeiter = this.mitarbeiter.length;
		for (int i=0; i<anzahlMitarbeiter; i++) {
			if (getMitarbeiter()[i] == null) {
				mitarbeiter[i] = neuerMitarbeiter;
				return true;
			} 				
		}
		return false;
	}
	
	public boolean removeMitarbeiter(Mitarbeiter mitarbeiter) {
		int anzahlMitarbeiter = this.mitarbeiter.length;
		for (int i=0; i<anzahlMitarbeiter; i++) {
			if (mitarbeiter.getName() == this.mitarbeiter[i].getName()) {
				this.mitarbeiter[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public double berechnePersonalkosten() {
		int anzahlMitarbeiter = this.mitarbeiter.length;
		double personalkosten = 0;
		for (int i=0; i<anzahlMitarbeiter; i++) {
			if (getMitarbeiter()[i] != null) {
			personalkosten += mitarbeiter[i].berechneVerdienst();
			}
		}
		return personalkosten;
	}
	
	public void zeigeArbeiterMitWenigerAlsXStunden(double stunden) {
		int anzahlMitarbeiter = this.mitarbeiter.length;
		System.out.println("Arbeiter mit weniger als " + stunden + " Stunden:");
		for (int i=0; i<anzahlMitarbeiter; i++) {
			if (mitarbeiter[i] instanceof Arbeiter) {
				// s. https://stackoverflow.com/questions/10673471/how-can-i-access-methods-in-a-subclass
				// "This is not a very good way to do things in Java" - was wäre die bessere Lösung?
				if (((Arbeiter)mitarbeiter[i]).getGeleisteteStunden() < stunden) {
					System.out.println(mitarbeiter[i]);
				}
			}
		}
	}
	
}
