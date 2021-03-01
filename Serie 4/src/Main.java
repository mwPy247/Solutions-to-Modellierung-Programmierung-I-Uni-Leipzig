
public class Main {

	public static void main(String[] args) {
		String s = "hallo.tx";
		BuchstabenStat bs = new BuchstabenStat();
		try {
			bs.pruefeDateityp(s);
			for(int i=0; i<s.length(); i++) {
				bs.verarbeiteZeichen(s.charAt(i));
			}
		} catch (FalscherDateitypException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
