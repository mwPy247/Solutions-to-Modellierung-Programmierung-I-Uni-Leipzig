package Marktsimulation;

class Marktsimulator {
	
	private double bleibBeiA;
	private double bleibBeiB;
	public Marktanteil[] tagesMarktanteil;
	
	public Marktsimulator(Marktanteil start, int tage, double a, double b) {
		
		tagesMarktanteil = new Marktanteil[tage+1];
		tagesMarktanteil[0] = start;
		this.bleibBeiA = a;
		this.bleibBeiB = b;
		
	}

	
	public void simuliere() {

		int tages = this.tagesMarktanteil.length;
		for (int i=1; i <= tages-1; i++) {	
			
			this.tagesMarktanteil[i] = this.tagesMarktanteil[i-1].naechsterTag(bleibBeiA, bleibBeiB);
		}		
	    
	}
	
	public void zeigeMarktverlauf() {
		
		this.simuliere();
		int tage = tagesMarktanteil.length;
		
		int ersterKaeuferVonA = tagesMarktanteil[0].getKaeuferVonA();
		String listeVonA = String.valueOf(ersterKaeuferVonA);
		
		for (int i=1; i <= tage-1; i++) {
			
			int naechsterKaeuferAInt = tagesMarktanteil[i].getKaeuferVonA();
			String naechsterKaeuferAStr = String.valueOf(naechsterKaeuferAInt);
			listeVonA = listeVonA.concat(" " + naechsterKaeuferAStr);
			
		}
		
		int ersterKaeuferVonB = tagesMarktanteil[0].getKaeuferVonB();
		String listeVonB = String.valueOf(ersterKaeuferVonB);
		
		for (int j=1; j <= tage-1; j++) {
			
			int naechsterKaeuferBInt = tagesMarktanteil[j].getKaeuferVonB();
			String naechsterKaeuferBStr = String.valueOf(naechsterKaeuferBInt);
			listeVonB = listeVonB.concat(" " + naechsterKaeuferBStr);
			
		}
		
		System.out.println("Marktentwicklung:\nProdukt A: " + listeVonA + "\nProdukt B: " + listeVonB + "\nFinale Marktaufteilung: \n" + this.tagesMarktanteil[20]);
	}
	

}
