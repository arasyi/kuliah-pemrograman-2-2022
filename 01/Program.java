import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukkan banyak mahasiswa: ");
		int banyakMahasiswa = in.nextInt();
		in.nextLine();
		
		String[] namaMahasiswa = new String[banyakMahasiswa];
		int[] nilaiMahasiswa = new int[banyakMahasiswa];
		for (int i = 0; i < banyakMahasiswa; i++) {
			System.out.print(
				"Masukkan nama mahasiswa ke-" + (i + 1) + ": "
			);
			namaMahasiswa[i] = in.nextLine();
			
			System.out.print(
				"Masukkan nilai mahasiswa ke-" + (i + 1) + ": "
			);
			nilaiMahasiswa[i] = in.nextInt();
			in.nextLine();
		}
		
		int n = banyakMahasiswa;
		boolean swapped;
		do {
			swapped = false;
			for (int i = 1; i < n; i++) {
				if (nilaiMahasiswa[i - 1] < nilaiMahasiswa[i]) {
					int nilaiTemp = nilaiMahasiswa[i - 1];
					nilaiMahasiswa[i - 1] = nilaiMahasiswa[i];
					nilaiMahasiswa[i] = nilaiTemp;
					
					String namaTemp = namaMahasiswa[i - 1];
					namaMahasiswa[i - 1] = namaMahasiswa[i];
					namaMahasiswa[i] = namaTemp;
					
					swapped = true;
				}
			}
		} while (swapped);
		
		
		
		for (int i = 0; i < banyakMahasiswa; i++) {
			System.out.printf(
				"%d. Nama = %s, Nilai = %d\n",
				i + 1, namaMahasiswa[i], nilaiMahasiswa[i]
			);
		}
	}
}
