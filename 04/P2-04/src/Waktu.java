public class Waktu {
    private int jam;
    private int menit;
    private int detik;

    public Waktu(int jam, int menit, int detik) {
        this.setJam(jam);
        this.setMenit(menit);
        this.setDetik(detik);
    }

    public Waktu(int jam, int menit) {
        this.setJam(jam);
        this.setMenit(menit);
    }

    public Waktu(int jam) {
        this.setJam(jam);
    }

    public Waktu() {
    }


    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        if (0 <= jam && jam <= 23) {
            this.jam = jam;
        } else {
            this.jam = 0;
        }
    }

    public int getMenit() {
        return menit;
    }

    public void setMenit(int menit) {
        if (0 <= menit && menit <= 59) {
            this.menit = menit;
        } else {
            this.menit = 0;
        }
    }

    public int getDetik() {
        return detik;
    }

    public void setDetik(int detik) {
        if (0 <= detik && detik <= 59) {
            this.detik = detik;
        } else {
            this.detik = 0;
        }
    }

    public void print() {
        System.out.printf(
                "%02d:%02d:%02d\n",
                getJam(), getMenit(), getDetik()
        );
    }

    @Override
    public String toString() {
        return String.format(
                "%02d:%02d:%02d",
                getJam(), getMenit(), getDetik()
        );
    }
}
