
import java.util.HashMap;
import java.util.Scanner;

public class BookDatabase {
    private static BookDatabase instance;
    private String bookName;
    private Integer BookID =0;
    private BookDatabase(){}
    public static synchronized BookDatabase getInstance(){
        if(instance == null){
            instance = new BookDatabase();
        }
        return instance;
    }
    public HashMap<Integer, String> map = new HashMap<Integer, String>();
    {
        map.put(1, new String("Book1"));
        map.put(2, new String("Book2"));
        map.put(3, new String("Book3"));
        map.put(4, new String("Book4"));
        map.put(5, new String("Book5"));
        map.put(6, new String("Book6"));
    }

    public void addBook(){
        System.out.print("Enter the name of the book you want to add: ");
        Scanner bookUserInput = new Scanner(System.in);
        bookName = bookUserInput.nextLine();
        map.put(BookID + 1, bookName);
        BookID++;
        System.out.println(map);
    }
    public void removeBook(){
        System.out.print("Enter the book key you want to remove: ");
        Scanner scan = new Scanner(System.in);
        int bookKey = scan.nextInt();
        map.remove(bookKey);
        System.out.println(map);
    }
    public void viewBook(){
        System.out.print("Enter the book key you want to view: ");
        Scanner scan = new Scanner(System.in);
        int bookKey = scan.nextInt();
        map.get(bookKey);
        System.out.println(map.get(bookKey));
    }
}
