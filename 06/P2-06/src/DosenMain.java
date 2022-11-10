public class DosenMain {
    public static void main(String[] args) {
        Dosen doni = new Dosen(
                "doni",
                "doni123",
                "doni@uisi.ac.id",
                "Doni Setio Pambudi",
                "1234",
                "071234",
                "Informatika"
        );
        System.out.println(doni);
        doni.sayHello();
    }
}
