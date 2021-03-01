
public class BaumProzessor {
	
	private Knoten wurzelDesBaumes;
	private Operator operator;
	
	public BaumProzessor(Knoten wurzelDesBaumes, Operator operator) {
		this.wurzelDesBaumes = wurzelDesBaumes;
		this.operator = operator;
	}
	
	public void berechneErgebnis( ) {
		verarbeiteKnoten(wurzelDesBaumes);
		System.out.println(operator.liefereErgebnis());
		System.out.println(operator.getBezeichnung());
	}
	
	private void verarbeiteKnoten(Knoten knoten) {
		operator.verarbeiteWert(knoten.getWert());
		for (int i=0; i<knoten.getKinder().size(); i++) {
			verarbeiteKnoten(knoten.getKinder().get(i));
		}
	}
	
	

}
