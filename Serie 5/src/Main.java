import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//Erstelle Beispielbaum:
		Knoten knoten1 = new Knoten(1.0);
		Knoten knoten2 = new Knoten(5.3);
		Knoten knoten3 = new Knoten(9.2);
		Knoten knoten4 = new Knoten(4.4, Arrays.asList(knoten1,knoten2));
		Knoten knoten5 = new Knoten(3.1, Arrays.asList(knoten3));
		Knoten knoten6 = new Knoten(7.0, Arrays.asList(knoten4,knoten5));
		
		//Erstelle Operatoren und Baumprozessor:
		Operator summe = new Summe();			
		Operator durchschnitt = new Durchschnitt();
		BaumProzessor baumProzessorSumme = new BaumProzessor(knoten6, summe);
		BaumProzessor baumProzessorDurchschnitt = new BaumProzessor(knoten6, durchschnitt);
		
		//Führe Operationen aus:
		baumProzessorSumme.berechneErgebnis();
		baumProzessorDurchschnitt.berechneErgebnis();
	}

}
