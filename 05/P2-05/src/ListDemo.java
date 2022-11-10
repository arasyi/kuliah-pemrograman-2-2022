import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> mahasiswa = new ArrayList<>();
//        List<String> mahasiswa = new LinkedList<>();
//        ArrayList<String> mahasiswa = new ArrayList<>();
//        LinkedList<String> mahasiswa = new LinkedList<>();

        mahasiswa.add("Ani");
        mahasiswa.add("Budi");

        System.out.println(mahasiswa.get(0));
        System.out.println(mahasiswa.get(1));
//        System.out.println(mahasiswa.get(2));

        mahasiswa.add("Chandra");
        mahasiswa.add("Deni");

        for (int i = 0; i < mahasiswa.size(); i++) {
            System.out.println(mahasiswa.get(i));
        }

        mahasiswa.remove(0); // remove Ani
        System.out.println(mahasiswa.get(0));

        mahasiswa.remove("budi");
        for (String nama: mahasiswa) {
            System.out.println(nama);
        }
    }
}
