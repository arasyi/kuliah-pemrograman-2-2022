public class Main {
    public static void main(String[] args) {
        Mahasiswa ani = new Mahasiswa("Ani");
        Dosen doni = new Dosen("Doni");

        sapa(ani);
        sapa(doni);

//        User.setNama("123");
        User.sayHello();
        User.message = "Halo";
        User.sayHello();

        User user1 = new User();
        user1.setNama("Ani");
        User user2 = new User();
        user2.setNama("Budi");

        user1.sayHello();
        user2.sayHello();
        user1.message = "user1 message";
        user1.sayHello();
        user2.sayHello();
    }

    public static void sapa(User user) {
        System.out.println(
                "Halo " + user.getNama() + ", Selamat datang di GAPURA UISI."
        );

        if (user instanceof Mahasiswa mahasiswa) {
            System.out.println(user.getNama() + " adalah seorang Mahasiswa");
//            Mahasiswa mahasiswa = (Mahasiswa) user;
            mahasiswa.getProdi();
            mahasiswa.getDosenWali();
        } else if (user instanceof Dosen dosen) {
            System.out.println(user.getNama() + " adalah seorang Dosen");
            dosen.getProdi();
        }
    }
}