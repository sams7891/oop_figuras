package uzdevums5;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import uzdevums1.MinkuTante;

public class Figuras {
	
	static ArrayList<Centrs> centraObjekti = new ArrayList<>();
	static ArrayList<Cetrsturis> cetrsturaObjekti = new ArrayList<>();
	static ArrayList<Aplis> aplaObjekti = new ArrayList<>();
	static ArrayList<Trijsturis> trijsturaObjekti = new ArrayList<>();


	static String[] objektuPogas = {"Centrs", "Četrstūris", "Aplis", "Trijstūris", "Atgriezties"};
	
	public static void main(String[] args) {
		/*
		Centrs centraP1 = new Centrs(-10, 12);
		System.out.println(centraP1.izvaditKoordinatas());
		centraP1.parvietot(5, -2);
		System.out.println(centraP1.izvaditKoordinatas());
		
		Cetrsturis cetrSturis1 = new Cetrsturis();
		System.out.println(cetrSturis1.izvaditCetrsturaInfo());
		System.out.println(cetrSturis1.punkts.izvaditKoordinatas());
		
		Cetrsturis cetrsturis2 = new Cetrsturis(centraP1, 5, 11);
		System.out.println(cetrsturis2.izvaditCetrsturaInfo() + "\n" + cetrsturis2.punkts.izvaditKoordinatas());
		
		Centrs punkts2 = new Centrs(5, 23);
		Aplis aplis1 = new Aplis(punkts2, 5);
		System.out.println(aplis1.izvaditAplaInfo() + "\nr = " + aplis1.radiuss);
		*/
		
		
		
		int izvele, poga;
		
		
		do {
			izvele = MinkuTante.skaitlaParbaude("Ko vēlies darīt?\n"
					+ "0 - Apturēt\n"
					+ "1 - Izveidot objektu\n"
					+ "2 - Aplūkot objektus\n"
					+ "3 - Izsaukt metodi", 0, 3);
			
			if(izvele == -1)
				izvele = 0;
			
			switch(izvele) {
			case 0:
				JOptionPane.showMessageDialog(null, "Programma apturēta!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case 1:
				OIzveide.izveidotObjektu();
				break;
			}
		}while(izvele != 0);
	}

}
