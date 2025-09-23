package uzdevums5;

public class Aplis {
	public Centrs punkts;
	public double radiuss;
	
	public Aplis(Centrs p, double r) {
		punkts = p;
		radiuss = r;
	}
	
	public String izvaditAplaInfo() {
		return "Rādiuss: " + radiuss;
	}
	
	//Izveido metodi riņķa līnijas aprēķināšanai
	
	public double rinkaLinija(double r) {
		double c = Math.PI * 2 * r;
		return Math.round(c * 100.0) / 100.0;
	}
	
	public double rinkaLaukums(double r) {
		double c = Math.PI * Math.pow(r, 2);
		return Math.round(c * 100.0 ) / 100.0;
	}
}
