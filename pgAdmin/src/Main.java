import java.util.Collection;
import java.util.Scanner;
public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Connec db = new Connec();
        //enter your password for postgresql in the space
        db.conn("postgres","postgres","your password");
        }
    }
