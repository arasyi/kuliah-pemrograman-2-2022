import java.sql.*;
import java.util.Scanner;

public class InsertData {
    public static void main(String[] args) throws SQLException {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama binatang: ");
        String nama = in.nextLine();
        System.out.print("Banyak kaki: ");
        int banyakKaki = in.nextInt();

        // 1. Establish Connection
        String databaseUrl = "jdbc:sqlite:db.sqlite";
        //String databaseUrl = "jdbc:mysql://hostname:port/dbName";
        Connection connection =
                DriverManager.getConnection(databaseUrl);

        // 2. Create Statement
        Statement statement =
                connection.createStatement();

        // 3. Execute SQL Statement
        /*
        String sql =
                "INSERT INTO binatang(nama, banyak_kaki) " +
                "values ('" + nama + "', " + banyakKaki + ")";
        int insertedRows = statement.executeUpdate(sql);
        System.out.println("Inserted rows = " + insertedRows);
        */
        // PREPARED STATEMENT
        String sql =
                "INSERT INTO binatang(nama, banyak_kaki) " +
                "values (?, ?)";
        PreparedStatement ps =
                connection.prepareStatement(sql);
        ps.setString(1, nama);
        ps.setInt(2, banyakKaki);
        int insertedRows = ps.executeUpdate();
        System.out.println("Inserted rows = " + insertedRows);


        // 4. Process ResultSet (if necessary)
        // 5. Close the connection
        connection.close();

    }
}
