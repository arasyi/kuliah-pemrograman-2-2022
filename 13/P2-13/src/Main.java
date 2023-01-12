import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.DeleteBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String databaseUrl = "jdbc:sqlite:app.db";
        try (
                ConnectionSource connectionSource =
                        new JdbcConnectionSource(databaseUrl);
        ) {
            TableUtils.createTableIfNotExists(
                    connectionSource,
                    Binatang.class
            );

            Dao<Binatang, Integer> binatangDao =
                    DaoManager.createDao(
                            connectionSource, Binatang.class
                    );

            Scanner in = new Scanner(System.in);
            System.out.print("Masukkan nama binatang: ");
            String nama = in.nextLine();
            System.out.print("Masukkan banyak kakinya: ");
            int banyakKaki = in.nextInt();

            Binatang binatang = new Binatang(nama, banyakKaki);
            binatangDao.create(binatang);

            List<Binatang> daftarBinatang =
                    binatangDao.queryForAll();

            for (Binatang b : daftarBinatang) {
                System.out.printf(
                        "Id: %d, Nama: %s, Banyak Kaki: %d\n",
                        b.getId(), b.getNama(), b.getBanyakKaki()
                );
            }

            List<Binatang> binatangBerkakiBanyak =
                    binatangDao.queryBuilder().where()
                            .gt("banyakKaki", 4)
                            .and()
                            .le("banyakKaki", 10)
                            .query();

            int id = 2;
            Binatang binatang2 = binatangDao.queryForId(id);
            binatang2.setNama("Nama Binatang Baru");
            binatangDao.update(binatang2);

            binatangDao.delete(binatang2);

            DeleteBuilder<Binatang, Integer> deleteBuilder =
                    binatangDao.deleteBuilder();
            deleteBuilder.where().le("banyakKaki", 0);
            deleteBuilder.delete();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}