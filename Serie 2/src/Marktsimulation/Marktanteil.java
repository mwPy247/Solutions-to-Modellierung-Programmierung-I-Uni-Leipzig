package Marktsimulation;

class Marktanteil {
	
	private int kaeuferVonA;
	private int kaeuferVonB;
	
	public Marktanteil(int a, int b) {
		this.kaeuferVonA = a;
		this.kaeuferVonB = b;
	}
	
	public int getKaeuferVonA() {
		return kaeuferVonA;
	}
	
	public int getKaeuferVonB() {
		return kaeuferVonB;
	}
	
	public void setKaeuferVonA(int a) {
		this.kaeuferVonA = a;
	}
	
	public void setKaeuferVonB(int b) {
		this.kaeuferVonA = b;
	}
		
	public Marktanteil naechsterTag(double bleibBeiA, double bleibBeiB) {
		
		int kaeuferVonA_neu = 0;
		int kaeuferVonB_neu = 0;
		
		for (int i=0; i < this.getKaeuferVonA(); i++) {
			if (Math.random() > bleibBeiA) {++kaeuferVonB_neu;}
		}
		
		for (int j=0; j < this.getKaeuferVonB(); j++) {
			if (Math.random() > bleibBeiB) {++kaeuferVonA_neu;}
		}
		
		Marktanteil marktanteil_neu = new Marktanteil(this.getKaeuferVonA() - kaeuferVonB_neu + kaeuferVonA_neu, this.getKaeuferVonB() - kaeuferVonA_neu + kaeuferVonB_neu);
		
		return marktanteil_neu;
		
	}

	public String toString() {
		
		double kaeufer = this.kaeuferVonA + this.kaeuferVonB;
		long AAnteil = Math.round((this.kaeuferVonA / kaeufer) * 100);
		long BAnteil = Math.round((this.kaeuferVonB / kaeufer) * 100);
		
		return "Marktanteil Käufer Produkt A: " + this.kaeuferVonA + " (" + AAnteil + "%) Käufer Produkt B: " + this.kaeuferVonB + " (" + BAnteil + "%)";
		
	}

}

