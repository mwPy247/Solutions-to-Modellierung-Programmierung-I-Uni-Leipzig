package collectionsUndStrings;
import java.util.*;

public class Gericht implements Comparable<Gericht> {
	
	private List<Zutat> zutaten = new ArrayList<Zutat>();
	public double preis;
	
	
	public Gericht() {
		preis = 1.0;
	}
	
	public void addZutat(Zutat zutat) {
		zutaten.add(zutat);
		preis += zutat.getPreis();
	}
	
	public boolean hatZutat(Zutat zutat) {
		for (int i=0; i<zutaten.size(); i++) {
			if (zutaten.get(i).equals(zutat)) {
				return true;	
			}
		} 
		return false;
	}
	
	public String getName() {
		StringBuilder str = new StringBuilder(); 
		for (int i=0; i<zutaten.size(); i++) {
			str.append(zutaten.get(i).getName().substring(0,3)); 
		}
		return str.toString();
	}
	
	public boolean istVegan() {
		for (int i=0; i<zutaten.size(); i++) {
			if (zutaten.get(i).getVegan() == false) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public int compareTo(Gericht gericht) {
		if (preis < gericht.preis) {
			return -1;
		} else if (preis == gericht.preis) {
			return 0;
		} else {
			return 1;
		}
	}
	
	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder(); 
		
		str.append(getName());
		
		if (istVegan()) {str.append(" (vegan)");}
		
		for (int i=0; i<zutaten.size(); i++) {
			str.append(" " + zutaten.get(i).getName());
		}
		
		str.append(" " + String.format("%.2f", preis) + " Euro");
		
		return str.toString();
	}
	
}
