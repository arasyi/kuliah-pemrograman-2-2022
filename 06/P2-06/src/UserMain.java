public class UserMain {
    public static void main(String[] args) {
        User ani = new User(
                "ani",
                "ani123",
                "ani@gmail.com",
                "Ani Rahmadiani"
        );

        User ani2 = new User(
                "ani",
                "ani1234",
                "ani@gmail.com",
                "Ani Rahmadiani"
        );

        if (ani.equals(ani2)) {
            System.out.println("sama");
        } else {
            System.out.println("beda");
        }
    }
}
