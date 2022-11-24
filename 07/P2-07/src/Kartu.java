public class Kartu {
    private final int nilai; // AS = 1, 2-10, J=11, Q=12, K=13
    private final int lambang; // Keriting=1, Wajik=2, Hati=3, Sekop=4

    public static final int AS = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    public static final int KERITING = 1;
    public static final int WAJIK = 2;
    public static final int HATI = 3;
    public static final int SEKOP = 4;

    public Kartu(int nilai, int lambang) {
        this.nilai = nilai;
        this.lambang = lambang;
    }

    public int getNilai() {
        return nilai;
    }

    public int getLambang() {
        return lambang;
    }
}
