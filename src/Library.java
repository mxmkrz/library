import java.util.Arrays;

public class Library {
    private Book book[];

    public Library(int countBooks) {
        this.book = new Book[countBooks];
    }


    public Book[] getBook() {
        return book;
    }

    public void setBook(Book[] book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Library{" +
                "book=" + Arrays.toString(book) +
                '}';
    }
}
