import java.util.Date;
import java.util.List;

public class Pengarang {
    String namaDepan;
    String namaBelakang;
    Date tanggalLahir;
    String email;
    List<Buku> bukuKarangan;

    String getNamaLengkap() {
        return namaDepan + " " + namaBelakang;
    }
}
