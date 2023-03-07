public class ViewBooks implements Command{
    private Book randomBook;

    public ViewBooks(Book randomBook){
        this.randomBook = randomBook;
    }

    @Override
    public void execute() {
        randomBook.viewBook();
    }
}
