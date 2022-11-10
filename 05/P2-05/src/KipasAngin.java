public class KipasAngin {
    private int kecepatan;

    public int getKecepatan() {
        return kecepatan;
    }

    public void tarik() {
//        kecepatan--;
//        if (kecepatan < 0) {
//            kecepatan = 3;
//        }

        if (kecepatan == 0) {
            kecepatan = 3;
        } else {
            kecepatan--;
        }

//        if (kecepatan == 0) {
//            kecepatan = 3;
//        } else if (kecepatan == 3) {
//            kecepatan = 2;
//        } else if (kecepatan == 2) {
//            kecepatan = 1;
//        } else if (kecepatan == 1) {
//            kecepatan = 0;
//        }
    }

    public boolean isMenyala() {
        if (kecepatan == 0) {
            return false;
        } else {
            return true;
        }

//        return kecepatan> 0;

//        if (kecepatan == 0) {
//            return false;
//        } else if (kecepatan == 1) {
//            return true;
//        } ..
    }

    @Override
    public String toString() {
        return "KipasAngin{" +
                "kecepatan=" + kecepatan +
                ", menyala=" + isMenyala() +
                '}';
    }
}
