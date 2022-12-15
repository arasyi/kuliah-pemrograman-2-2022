import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        BangunDatar bangun1 = new BangunDatar();
//        BangunDatar bangun2 = new BangunDatar();
        Lingkaran lingkaran1 = new Lingkaran(12);
        Persegi persegi1 = new Persegi(7);

//        printBangun(bangun1);
//        printBangun(bangun2);
        printBangun(lingkaran1);
//        printBangun(persegi1);

        persegi1.print();
        cetak(persegi1);

        Mahasiswa ani = new Mahasiswa("Ani");
        cetak(ani);

        List<Integer> daftarNilai = new ArrayList<>();
        List<Integer> daftarNilai2 = new LinkedList<>();
        BangunDatar a = new Lingkaran(12);
    }

    public static void cetak(Printable p) {
        p.print();
    }

    public static void printBangun(BangunDatar b) {
        System.out.printf(
                "Keliling = %.2f\n",
                b.getKeliling()
        );
        System.out.printf(
                "Luas = %.2f\n",
                b.getLuas()
        );
    }
}