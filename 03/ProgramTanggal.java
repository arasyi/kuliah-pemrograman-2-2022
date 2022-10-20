public class ProgramTanggal {
	public static void main(String[] args) {
		Tanggal hariIni = new Tanggal();
		hariIni.print();
		
		Tanggal kemarin = new Tanggal(19, 10, 2022);
		kemarin.print();
		
		Tanggal besok = new Tanggal(21, 10, 2022);
		besok.print();
		
		Tanggal lusa = new Tanggal(22, 10, 2022);
		lusa.print();
	}
}

class Tanggal {
	int tanggal;
	int bulan;
	int tahun;
	
	// default constructor
	// otomatis dibuat jika tidak ada constructor lain
	Tanggal() {
		//System.out.println("halo dari constructor 1");
		tanggal = 1;
		bulan = 1;
		tahun = 2020;
	}
	
	// constructor baru
	Tanggal(int tanggal, int bulan, int tahun) { 
		//System.out.println("halo dari constructor 2");
		this.tanggal = tanggal;
		this.bulan = bulan;
		this.tahun = tahun;
	}
	
	void print() {
		System.out.printf(
			"%d-%d-%d\n",
			tanggal, bulan, tahun
		);
	}
	
	int hari() {
		return 0;
	}
	
	int selisihHari(Tanggal lain) {
		return 0;
	}
	
	Tanggal tambahHari(int hari) {
		return null;
	}
}
