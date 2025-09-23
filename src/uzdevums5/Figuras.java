package uzdevums5;

public class Figuras {

	public static void main(String[] args) {
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
	}

}
