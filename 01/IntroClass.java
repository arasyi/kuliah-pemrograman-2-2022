public class IntroClass {
	public static void main(String[] args) {
		int nilai = 90;
		Mahasiswa budi = new Mahasiswa();
		budi.nim = 123;
		budi.nama = "Budi Sugiarto";
		
		System.out.println(budi.nim);
		System.out.println(budi.nama);
	}
}
class Mahasiswa {
	int nim;
	String nama;
}
