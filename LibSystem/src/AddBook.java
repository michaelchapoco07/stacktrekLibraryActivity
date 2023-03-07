public class AddBook implements Command {
    private Book randomBook;

    public AddBook(Book randomBook){
        this.randomBook = randomBook;
    }

    @Override
    public void execute() {
        randomBook.addBook(1,"Added this");
        randomBook.addBook(12,"Book 12 added");
    }
}
