import java.util.Scanner;
public class ProgramV2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukkan banyak mahasiswa: ");
		int banyakMahasiswa = in.nextInt();
		in.nextLine();
		
		
		Mahasiswa[] data = new Mahasiswa[banyakMahasiswa];
		for (int i = 0; i < banyakMahasiswa; i++) {
			data[i] = new Mahasiswa();
			
			System.out.print(
				"Masukkan nama mahasiswa ke-" + (i + 1) + ": "
			);
			data[i].nama = in.nextLine();
			
			System.out.print(
				"Masukkan nilai mahasiswa ke-" + (i + 1) + ": "
			);
			data[i].nilai = in.nextInt();
			in.nextLine();
			
			System.out.print(
				"Masukkan asal mahasiswa ke-" + (i + 1) + ": "
			);
			data[i].asal = in.nextLine();
		}
		
		int n = banyakMahasiswa;
		boolean swapped;
		do {
			swapped = false;
			for (int i = 1; i < n; i++) {
				if (data[i - 1].nilai < data[i].nilai) {
					Mahasiswa temp = data[i - 1];
					data[i - 1] = data[i];
					data[i] = temp;
					swapped = true;
				}
			}
		} while (swapped);
		
		
		for (int i = 0; i < banyakMahasiswa; i++) {
			System.out.printf(
				"%d. Nama = %s, Nilai = %d, Asal = %s\n",
				i + 1, data[i].nama, data[i].nilai, data[i].asal
			);
		}
	}
}

class Mahasiswa {
	String nama;
	int nilai;
	String asal;
}
