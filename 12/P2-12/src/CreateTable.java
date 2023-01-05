import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) throws SQLException {
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
                CREATE TABLE IF NOT EXISTS binatang (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    nama TEXT NOT NULL,
                    banyak_kaki INTEGER NOT NULL
                );
                """;
        int res = statement.executeUpdate(sql);
        System.out.println("res = " + res);

        // 4. Process ResultSet (if necessary)
        // 5. Close the connection
        connection.close();

    }
}
