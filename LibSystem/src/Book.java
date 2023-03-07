import java.util.HashMap;

public class Book {
    public HashMap<Integer, String> map = new HashMap<Integer, String>();

    {
        map.put(1, new String("Book1"));
        map.put(2, new String("Book2"));
        map.put(3, new String("Book3"));
        map.put(4, new String("Book4"));
        map.put(5, new String("Book5"));
        map.put(6, new String("Book6"));
    }

    public void addBook(Integer Key, String Value){
        map.put(Key, Value);
    }

    public void removeBook(Integer Key){
        map.remove(Key);
    }

    public void viewBook(){
        System.out.println(map);
    }
}
