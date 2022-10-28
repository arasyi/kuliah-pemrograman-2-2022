public class LingkaranTest {
    public static void main(String[] args) {
        Lingkaran pentol = new Lingkaran();
        pentol.setRadius(1);
        System.out.println("Pentol = " + pentol);

        Lingkaran kancing = new Lingkaran();
        kancing.setDiameter(1);
        System.out.println("Kancing = " + kancing);

        Lingkaran donat = new Lingkaran();
        donat.setKeliling(40);
        System.out.println("Donat = " + donat);

        Lingkaran ban = new Lingkaran();
        ban.setLuas(100);
        System.out.println("Ban = " + ban);
    }
}
