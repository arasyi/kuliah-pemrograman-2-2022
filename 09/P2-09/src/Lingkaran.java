public class Lingkaran
        extends BangunDatar {

    private double radius;

    @Override
    public double getKeliling() {
        return Math.PI * radius * 2;
    }

    @Override
    public double getLuas() {
        return Math.PI * radius * radius;
    }

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
