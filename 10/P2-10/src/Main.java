import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedListInteger myIntList = new LinkedListInteger();
        myIntList.add(1);
        myIntList.add(2);
        myIntList.print();

        LinkedListString myStrList = new LinkedListString();
        myStrList.add("Ani");
        myStrList.add("Budi");
        myStrList.print();

        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(12);
        intList.add(4);
        intList.print();

        LinkedList<String> strList = new LinkedList<>();
        strList.add("Ani");
        strList.add("Budi");
        strList.print();

        Map<Integer, String> mahasiswa = new HashMap<>();
        mahasiswa.put(1, "Ani");
        mahasiswa.put(2, "Budi");
        String mhs = mahasiswa.get(2);
        System.out.println(mhs);
    }
}
