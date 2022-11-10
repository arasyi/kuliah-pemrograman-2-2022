import java.util.ArrayList;
import java.util.List;

public class UKM {
    private String nama;
    private String deskripsi;
    private String namaPembina;
    private List<Mahasiswa> anggota;

    public UKM(String nama, String deskripsi, String namaPembina) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.namaPembina = namaPembina;
        this.anggota = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getNamaPembina() {
        return namaPembina;
    }

    public void setNamaPembina(String namaPembina) {
        this.namaPembina = namaPembina;
    }

    public List<Mahasiswa> getAnggota() {
        return anggota;
    }

    public void addAnggota(Mahasiswa anggota) {
        this.anggota.add(anggota);
    }

    public void removeAnggota(Mahasiswa anggota) {
        this.anggota.remove(anggota);
    }
}
