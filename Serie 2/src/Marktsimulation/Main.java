package Marktsimulation;

class Main {

	public static void main(String[] args) {
		
		Marktanteil ma = new Marktanteil(5000, 5000);
		Marktsimulator ms = new Marktsimulator(ma, 20, 0.8, 0.7);
		ms.zeigeMarktverlauf();	
        
	}

}