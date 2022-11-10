public class KipasAnginTest {
    public static void main(String[] args) {
        KipasAngin kipasSaya = new KipasAngin();

        System.out.printf(
                "menyala=%s, kecepatan=%d\n",
                kipasSaya.isMenyala(),
                kipasSaya.getKecepatan()
        );
//        System.out.println(kipasSaya);

        for (int i = 0; i < 10; i++) {
            kipasSaya.tarik();
            System.out.printf(
                    "menyala=%s, kecepatan=%d\n",
                    kipasSaya.isMenyala(),
                    kipasSaya.getKecepatan()
            );
//            System.out.println(kipasSaya);
        }
    }
}
