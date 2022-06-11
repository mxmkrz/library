import java.util.Arrays;

public class AdminImpl extends User implements Administrator, Reader, Librarian {


    public AdminImpl(String name, Library library) {
        super(name, library);
    }


    @Override
    public void overdueNotification(ReaderImpl reader) {
        notification(reader);
    }

    @Override
    public boolean findBook(Book book) {
        return find(book);

    }

    @Override
    public Book orderBook(String nameBook, int dateOfPublication) {
        return order(nameBook,dateOfPublication);
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
        return "AdminImpl{" +
                "books=" + Arrays.toString(books) +
                ", name='" + name + '\'' +
                ", library=" + library +
                '}';
    }
}
