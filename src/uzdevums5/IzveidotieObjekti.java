package uzdevums5;

import java.util.ArrayList;

public class IzveidotieObjekti {

	static String izvadit(ArrayList<Centrs> centruSaraksts) {
		
		String str = "";

		for(int i = 0; i < centruSaraksts.size(); i++) {
			str += i + " - objekts\n" + centruSaraksts.get(i).izvaditKoordinatas();
		}
		return str;
		
	}
	
	static String izvaditCetrsturi(ArrayList<Cetrsturis> centruSaraksts) {
		
		String str = "";

		for(int i = 0; i < centruSaraksts.size(); i++) {
			str += i + " - objekts\n" + centruSaraksts.get(i).izvaditCetrsturaInfo() + centruSaraksts.get(i).punkts.izvaditKoordinatas();
		}
		return str;
		
	}
	
	static String izvaditAplis(ArrayList<Aplis> centruSaraksts) {
		
		String str = "";

		for(int i = 0; i < centruSaraksts.size(); i++) {
			str += i + " - objekts\n" + centruSaraksts.get(i).izvaditAplaInfo() + "\n" + centruSaraksts.get(i).punkts.izvaditKoordinatas();
		}
		return str;
		
	}
	
	static String izvaditTrijsturi(ArrayList<Trijsturis> centruSaraksts) {
		
		String str = "";

		for(int i = 0; i < centruSaraksts.size(); i++) {
			str += i + " - objekts\n" + centruSaraksts.get(i).izvadiTrijsturaInfo() + "\n" + centruSaraksts.get(i).punkts.izvaditKoordinatas();
		}
		return str;
		
	}
}
