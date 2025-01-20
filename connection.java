import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection{

    private static final String URL = "jdbc:mysql://localhost:3306/coursejdbc";
    private static final String USER = "root";
    private static final String PASSWORD = "0M3lh0r4dc#";

    public static Connection obterConexao() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}