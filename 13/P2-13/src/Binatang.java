import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "binatang")
public class Binatang {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(canBeNull = false, unique = true)
    private String nama;
    @DatabaseField(canBeNull = false)
    private int banyakKaki;

    public Binatang() {
    }

    public Binatang(String nama, int banyakKaki) {
        this.nama = nama;
        this.banyakKaki = banyakKaki;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBanyakKaki() {
        return banyakKaki;
    }

    public void setBanyakKaki(int banyakKaki) {
        this.banyakKaki = banyakKaki;
    }
}
