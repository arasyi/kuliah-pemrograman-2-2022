public class Bangun2D {
	public static void main(String[] args) {
		Lingkaran lingkaran1 = new Lingkaran();
		Lingkaran lingkaran2 = new Lingkaran();
		
		lingkaran1.radius = 4.9;
		lingkaran1.diameter = 2 * lingkaran1.radius;
		lingkaran1.keliling = Math.PI * lingkaran1.diameter;
		lingkaran1.luas = Math.PI * lingkaran1.radius * lingkaran1.radius;
		System.out.println("lingkaran1");
		System.out.printf(
			"R = %.2f, D = %.2f, K = %.2f, L = %.2f\n",
			lingkaran1.radius,
			lingkaran1.diameter,
			lingkaran1.keliling,
			lingkaran1.luas
		);
		
		lingkaran2.radius = 13.5;
		lingkaran2.diameter = 2 * lingkaran2.radius;
		lingkaran2.keliling = Math.PI * lingkaran2.diameter;
		lingkaran2.luas = Math.PI * lingkaran2.radius * lingkaran2.radius;
		System.out.println("lingkaran2");
		System.out.printf(
			"R = %.2f, D = %.2f, K = %.2f, L = %.2f\n",
			lingkaran2.radius,
			lingkaran2.diameter,
			lingkaran2.keliling,
			lingkaran2.luas
		);
	}
}

class Lingkaran {
	double diameter;
	double radius;
	double keliling;
	double luas;
}
class PersegiPanjang {
	double panjang;
	double lebar;
	double diagonal;
	double keliling;
	double luas;
}
class Segitiga {
	double sisiA;
	double sisiB;
	double sisiC;
	double keliling;
	double luas;
}
