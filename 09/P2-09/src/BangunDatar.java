abstract public class BangunDatar implements Printable {
    abstract public double getLuas();

    abstract public double getKeliling();

    public void print() {
        System.out.printf(
                "Keliling = %.2f\n",
                getKeliling()
        );
        System.out.printf(
                "Luas = %.2f\n",
                getLuas()
        );
    }
}
