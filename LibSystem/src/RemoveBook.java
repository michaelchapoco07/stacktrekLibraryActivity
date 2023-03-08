public class RemoveBook implements Command{
    private Book randomBook;

    public RemoveBook(Book randomBook){
        this.randomBook = randomBook;
    }

    @Override
    public void execute() {
        randomBook.removeBookMethod(1);
        randomBook.removeBookMethod(3);
    }
}
