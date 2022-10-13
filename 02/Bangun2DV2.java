public class Bangun2DV2 {
	public static void main(String[] args) {
		Lingkaran lingkaran1 = new Lingkaran();
		Lingkaran lingkaran2 = new Lingkaran();
		Lingkaran lingkaran3 = new Lingkaran();
		
		lingkaran1.radius = 4.9;
		System.out.println("lingkaran1");
		lingkaran1.print();
		
		lingkaran2.radius = 13.5;
		System.out.println("lingkaran2");
		lingkaran2.print();
		
		lingkaran3.radius = 7;
		System.out.println("lingkaran3");
		lingkaran3.print();
	}
}

class Lingkaran {
	double radius;
	double diameter() {
		return 2 * radius;
	}
	double keliling() {
		return 2 * Math.PI * radius;
		// return Math.PI * diameter();
	}
	double luas() {
		return Math.PI * radius * radius;
	}
	void print() {
		System.out.printf(
			"R = %.2f, D = %.2f, K = %.2f, L = %.2f\n",
			radius,
			diameter(),
			keliling(),
			luas()
		);
	}
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
