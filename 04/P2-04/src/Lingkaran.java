public class Lingkaran {
    private double radius;

    public Lingkaran() {
    }

    public Lingkaran(double radius) {
        this.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
    }

    public void setDiameter(double diameter) {
        setRadius(diameter / 2);
    }

    public double getDiameter() {
        return radius * 2;
    }

    public void setKeliling(double keliling) {
        setRadius(keliling / Math.PI / 2);
    }

    public double getKeliling() {
        return Math.PI * radius * 2;
    }

    public void setLuas(double luas) {
        if (luas >= 0) {
            setRadius(Math.sqrt(luas / Math.PI));
        }
    }

    public double getLuas() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return String.format(
                "Lingkaran{radius=%f, diameter=%f, keliling=%f, luas=%f}",
                getRadius(), getDiameter(), getKeliling(), getLuas()
        );
    }
}
