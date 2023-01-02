import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        while (!in.hasNextInt()) {
            in.next();
            System.out.print("a = ");
        }
        int a = in.nextInt();

        System.out.print("b = ");
        while (!in.hasNextInt()) {
            in.next();
            System.out.print("b = ");
        }
        int b = in.nextInt();

        if (b == 0) {
            System.out.println("a/b tidak terdefinisi");
        } else {
            System.out.println("a/b = " + (a / b));
        }


//        try {
//            Scanner in = new Scanner(System.in);
//            System.out.print("a = ");
//            int a = in.nextInt();
//            System.out.print("b = ");
//            int b = in.nextInt();
//
//            System.out.println("a/b = " + (a / b));
//        } catch (ArithmeticException e) {
//            System.out.println("Arithmetic exception");
//        } catch (java.util.InputMismatchException e) {
//            System.out.println("Input mismatch");
//        }
    }
}