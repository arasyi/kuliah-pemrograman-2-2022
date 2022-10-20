public class ProgramWaktu {
	public static void main(String[] args) {
		Waktu pagi = new Waktu(7);
		pagi.print();
		
		Waktu siang = new Waktu(12, 30);
		siang.print();
		
		Waktu malam = new Waktu(21, 30, 45);
		malam.print();
		
		Waktu tengahMalam = new Waktu();
		tengahMalam.print();
	}
}

class Waktu {
	int jam;
	int menit;
	int detik;
	
	void print() {
		System.out.printf(
			"%02d:%02d:%02d\n",
			jam, menit, detik
		);
	}
	
	Waktu() {
		//this.jam = 0;
		//this.menit = 0;
		//this.detik = 0;
		this(0); // constructor chaining: memanggil Waktu(int jam)
		
		//System.out.println("Waktu() is called");
	}
	
	Waktu(int jam) {
		//this.jam = jam;
		//this.menit = 0;
		//this.detik = 0;
		
		this(jam, 0); // constructor chaining: memanggil Waktu(int jam, int menit)
		
		//System.out.println("Waktu(jam) is called");
	}
	
	Waktu(int jam, int menit) {
		//this.jam = jam;
		//this.menit = menit;
		//this.detik = 0;
		this(jam, menit, 0); // constructor chaining: memanggil Waktu(int jam, int menit, int detik)
		
		//System.out.println("Waktu(jam, menit) is called");
	}
	
	Waktu(int jam, int menit, int detik) {
		//System.out.println("Waktu(jam, menit, detik) is called");
		
		this.jam = jam;
		this.menit = menit;
		this.detik = detik;
		
		// this(jam, menit, detik); // tidak bisa: tidak boleh dipanggil secara rekursif
	}
	
}
