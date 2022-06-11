import java.time.LocalDate;

public class LibrarianImpl extends User implements Librarian, Reader, Administrator {

    public LibrarianImpl(String name, Library library) {
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
    public void takeBook(Book book) {
       take(book);
    }

    @Override
    public void returnBook(Book book) {
        back(book);
    }


    @Override
    public Book orderBook(String nameBook, int dateOfPublication) {
        return order(nameBook,dateOfPublication);
    }
}
