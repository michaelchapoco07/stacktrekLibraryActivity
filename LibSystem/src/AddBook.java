public class AddBook implements Command {
    private Book randomBook;

    public AddBook(Book randomBook){
        this.randomBook = randomBook;
    }

    @Override
    public void execute() {
        randomBook.addBookMethod(12,"Book 12 added");
        randomBook.addBookMethod(15, "Hogwarts Legacy");
        randomBook.addBookMethod(1, "Moby Dick");
    }
}
