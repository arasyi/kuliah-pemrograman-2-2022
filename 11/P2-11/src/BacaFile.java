import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BacaFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String filepath = "D:/FileSaya.txt";
        try {
            Scanner file = new Scanner(
                    new File(filepath)
            );

            String line1 = file.nextLine();
            System.out.println(line1);

            String line2 = file.nextLine();
            System.out.println(line2);

            int c = 1 / 0;

//            String line3 = file.nextLine();
//            System.out.println(line3);
        } catch (FileNotFoundException e) {
            System.out.println(
                    "Error: file " + filepath + " tidak ditemukan."
            );
        } catch (java.util.NoSuchElementException e) {
            System.out.println(
                    "Format file tidak sesuai"
            );
        }
//        catch (Exception e) {
//            System.out.println("Error: Terjadi eksepsi lain");
//            System.out.println(e.getClass());
//        }
        finally {
            System.out.println("Finally block");
        }

        System.out.println("setelah try catch");
    }
}
