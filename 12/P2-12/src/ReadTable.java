import java.sql.*;

public class ReadTable {
    public static void main(String[] args) throws Exception {
        // 1. Establish Connection
        String databaseUrl = "jdbc:sqlite:db.sqlite";
        //String databaseUrl = "jdbc:mysql://hostname:port/dbName";
        Connection connection =
                DriverManager.getConnection(databaseUrl);

        // 2. Create Statement
        Statement statement =
                connection.createStatement();

        // 3. Execute SQL Statement
        String sql = """
                SELECT * FROM binatang;
                """;
        ResultSet rs = statement.executeQuery(sql);

        // 4. Process ResultSet (if necessary)
        while (rs.next()) {
            int id = rs.getInt(1); // col index dimulai dari 1
            String nama = rs.getString("nama");
            int banyakKaki = rs.getInt("banyak_kaki");

            System.out.printf(
                    "| %3d | %-20s | %3d |\n",
                    id, nama, banyakKaki
            );
        }

        // 5. Close the connection
        connection.close();
    }
}

