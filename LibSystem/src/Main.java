public class Main {
    public static void main(String[] args) {

        Book randomBook = new Book();

        AddBook forAddBook = new AddBook(randomBook);
        RemoveBook forRemoveBook = new RemoveBook(randomBook);
        ViewBooks forViewBooks = new ViewBooks(randomBook);

        Librarian librarian = new Librarian();
        librarian.takeCommand(forAddBook);
        librarian.takeCommand(forRemoveBook);
        librarian.takeCommand(forViewBooks);

        librarian.placeCommands();

    }
}