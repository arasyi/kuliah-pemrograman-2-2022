public class Mahasiswa extends User {
    protected ProgramStudi prodi;
    protected Dosen dosenWali;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }


    public ProgramStudi getProdi() {
        return prodi;
    }

    public void setProdi(ProgramStudi prodi) {
        this.prodi = prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }
}
