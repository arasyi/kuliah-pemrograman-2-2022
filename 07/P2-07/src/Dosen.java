public class Dosen extends User {
    protected ProgramStudi prodi;

    public Dosen(String nama) {
        this.nama = nama;
    }

    public ProgramStudi getProdi() {
        return prodi;
    }

    public void setProdi(ProgramStudi prodi) {
        this.prodi = prodi;
    }
}
