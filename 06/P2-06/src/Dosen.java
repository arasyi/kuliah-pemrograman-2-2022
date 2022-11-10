import java.util.List;

public class Dosen extends User {
    String nip;
    String nidn;
    String prodi;
    List<Mahasiswa> mahasiswaWali;
    // dst


    public Dosen(String username, String password, String email, String nama, String nip, String nidn, String prodi) {
        super(username, password, email, nama);
        this.nip = nip;
        this.nidn = nidn;
        this.prodi = prodi;
    }

    public Dosen() {
    }

    @Override
    public String toString() {
        sayHello();
        return "Dosen{" +
                "username='" + getUsername() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", nama='" + getNama() + '\'' +
                ", nip='" + nip + '\'' +
                ", nidn='" + nidn + '\'' +
                ", prodi='" + prodi + '\'' +
                '}';
    }

    public void sayHello() {
        System.out.println("Dosen says hello");
    }
}
