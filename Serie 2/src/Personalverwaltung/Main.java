package Personalverwaltung;

class Main {

	public static void main(String[] args) {
		Verwaltung verwaltung = new Verwaltung(8);
		Arbeiter arbeiter1 = new Arbeiter("Daniel Düsentrieb", 20, 1);
		Arbeiter arbeiter2 = new Arbeiter("Donald Duck", 65, 77);
		Arbeiter arbeiter3 = new Arbeiter("Dagobert Duck", 23, 4);
		Arbeiter arbeiter4 = new Arbeiter("Mickey Mouse", 11, 88);
		Angestellter angestellter1 = new Angestellter("Benedictus de Spinoza", 9000);
		Angestellter angestellter2 = new Angestellter("Immanuel Kant", 5000);
		Angestellter angestellter3 = new Angestellter("Georg Wilhelm Friedrich Hegel", 8500);
		Angestellter angestellter4 = new Angestellter("Richard David Precht", 60);
		verwaltung.addMitarbeiter(arbeiter1);
		verwaltung.addMitarbeiter(arbeiter2);
		verwaltung.addMitarbeiter(arbeiter3);
		verwaltung.addMitarbeiter(arbeiter4);
		verwaltung.addMitarbeiter(angestellter1);
		verwaltung.addMitarbeiter(angestellter2);
		verwaltung.addMitarbeiter(angestellter3);
		verwaltung.addMitarbeiter(angestellter4);
		
		// Berechnung der gesamten Personalkosten:
		System.out.println(verwaltung.berechnePersonalkosten());
		System.out.println("---------------------------------");
		// Richard David Precht wird rausgeschmissen:
		verwaltung.removeMitarbeiter(verwaltung.getMitarbeiter()[7]);
		// Neue Berechnung der Personalkosten:
		System.out.println(verwaltung.berechnePersonalkosten());
		System.out.println("---------------------------------");
		// Donald Duck wird rausgeschmissen:
		verwaltung.removeMitarbeiter(verwaltung.getMitarbeiter()[1]);
		// Neue Berechnung der Personalkosten:
		System.out.println(verwaltung.berechnePersonalkosten());
		System.out.println("---------------------------------");
		// Ausgabe aller Arbeit mit Mindesstundenanzahl
		verwaltung.zeigeArbeiterMitWenigerAlsXStunden(80);

	}

}
