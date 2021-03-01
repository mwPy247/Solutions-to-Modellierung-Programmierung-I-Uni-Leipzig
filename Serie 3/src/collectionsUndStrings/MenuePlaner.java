package collectionsUndStrings;
import java.util.*;

public class MenuePlaner {

    private List<Zutat> zutatenListe;
    private Map<String, List<Gericht>> speiseplan;

    public MenuePlaner(Zutat[] zutatenArray) {
        zutatenListe = new ArrayList<Zutat>(Arrays.asList(zutatenArray));
        speiseplan = new HashMap<>();
    }

    private int zufallszahl(int minimum, int maximum) {
        return (int)(Math.random() * (maximum + 1 - minimum)) + minimum;
    }
    
    private Gericht erstelleGericht() {
    	int anzahlZutaten = zufallszahl(3,5);
    	int hinzugefuegt = 0;
    	Gericht gericht = new Gericht();
    	Zutat zutat;
    	
    	while (hinzugefuegt < anzahlZutaten) {
    		zutat = zutatenListe.get(zufallszahl(0,zutatenListe.size() - 1));
    		if (! gericht.hatZutat(zutat)) {
    			gericht.addZutat(zutat);
    			hinzugefuegt += 1;
    		}
    	}
    	return gericht;
    }

    private void erstelleMenueFuerWochentag(String tag, int anzahlGerichte) {
    	List<Gericht> menue = new ArrayList<Gericht>();
    	for (int i=0;i<anzahlGerichte;i++) {
    		menue.add(erstelleGericht());
    	}
    	speiseplan.put(tag, menue);
    }
    
    public void erstelleSpeiseplan() {
    	erstelleMenueFuerWochentag("Montag", 4);
    	erstelleMenueFuerWochentag("Dienstag", 4);
    	erstelleMenueFuerWochentag("Mittwoch", 5);
    }
    
    public String getMenueFuerWochentag(String tag) {
    	if (speiseplan.containsKey(tag)) {
    		Collections.sort(speiseplan.get(tag));
    		StringBuilder str = new StringBuilder(); 
    		str.append(tag + ": \n");
    		for (int i=0; i<speiseplan.get(tag).size(); i++) {
    			str.append(speiseplan.get(tag).get(i) + "\n"); 
    		}
    		return str.toString();
    	} else {
    		return "Die Mensa hat geschlossen!";
    	}
    }

}
