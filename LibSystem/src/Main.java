import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        BookDatabase bookSet = BookDatabase.getInstance();


        bookSet.viewBook();
        bookSet.addBook();
        bookSet.removeBook();
    }




}