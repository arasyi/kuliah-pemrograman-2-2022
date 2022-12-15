public class Mahasiswa implements Printable, Comparable<Mahasiswa> {
    private String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void print() {
        System.out.println(
                "Nama saya " + nama
        );
    }

    @Override
    public int compareTo(Mahasiswa mahasiswa) {
        return 0;
    }
}
