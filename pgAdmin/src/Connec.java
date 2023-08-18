import java.sql.Connection;
import java.sql.DriverManager;
public class Connec {
    public Connection conn(String dbname, String user, String pass){
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=public" + dbname, user, pass);
            if(conn!=null){
                System.out.println("Connected");
            }else {
                System.out.println("Connection Failed");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return conn;
    }

}
