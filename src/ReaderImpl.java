import java.util.Arrays;

public class ReaderImpl extends User implements Reader {


    public ReaderImpl(String name) {
        super(name);
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public void takeBook(Book book) {
        take(book);
    }

    @Override
    public void returnBook(Book book) {
        back(book);
    }


    @Override
    public String toString() {
        return "ReaderImpl{" +
                "books=" + Arrays.toString(books) +
                ", name='" + name + '\'' +
                '}';
    }
}
