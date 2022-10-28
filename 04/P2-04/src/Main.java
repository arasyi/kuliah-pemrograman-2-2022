public class Main {
    public static void main(String[] args) {
        Waktu siang = new Waktu(12, 30);
        System.out.println("Siang = " + siang);

        Waktu pagi = new Waktu(7, 30, 15);
        System.out.println("Pagi = " + pagi);

//        pagi.jam = 99;
//        System.out.println("Jam Pagi Baru = " + pagi.jam);
        pagi.setJam(99);
        System.out.println("Jam Pagi Baru = " + pagi.getJam());
        System.out.println("Pagi sekarang = " + pagi);

        Waktu waktuYangTidakJelas = new Waktu(99, -88, 77);
        System.out.println("Waktu yang tidak jelas = " + waktuYangTidakJelas);
    }
}