import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
//import java.util.Map;

public class BuchstabenStat {
	public HashMap<Character,Integer> buchstabenHaeufigkeiten;
	private long buchstabenAnzahl;
	
	public BuchstabenStat() {
		buchstabenHaeufigkeiten = new HashMap();
		buchstabenAnzahl = 0;

	}
	
	public void pruefeDateityp(String dateiname) throws FalscherDateitypException  {
		HashMap<Character,Integer> h = new HashMap<>();
		List<Integer> l = new ArrayList<>();
		Collections.sort(l);
		if (!dateiname.endsWith(".txt")) {
			throw new FalscherDateitypException(dateiname);
		}
	}
	
	public void verarbeiteZeichen(char zeichen) throws UngueltigesZeichenException {
		if (Character.isLetter(zeichen)) {
			buchstabenAnzahl += 1;
			buchstabenHaeufigkeiten.put(zeichen, buchstabenHaeufigkeiten.get(zeichen)+1);
		} else if (!Character.isDefined(zeichen)) {
			throw new UngueltigesZeichenException();
		}
	}
	
	private void verarbeiteZeile(String zeile) throws UngueltigesZeichenException{
		for (int i=0; i<zeile.length(); i++) {
			verarbeiteZeichen(zeile.charAt(i));
		}
	}
	
	public void analysiere(String dateiname) throws FalscherDateitypException {
		pruefeDateityp(dateiname);
	}
	
	public void zeigeTop10() {
		;
	}
	
	public String statistik() {
		return "hallo";
	}
	
	public void schreibeStatistik(String dateiname) {
		;
	}

}
