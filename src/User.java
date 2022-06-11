import java.time.LocalDate;

public abstract class User {
    protected Book[] books;
    protected String name;
    protected Library library;


    public User(String name) {
        this.books = new Book[50];
        this.name = name;
    }

    public User(String name, Library library) {
        this.books = new Book[50];
        this.name = name;
        this.library = library;
    }

    protected void notification(ReaderImpl reader){
        for (int i = 0; i < reader.getBooks().length; i++) {
            if (reader.getBooks()[i] != null) {
                if (reader.getBooks()[i].getTimeOfDelay().isBefore(LocalDate.now())) {
                    System.out.println("The deadline is overdue" + reader.getBooks()[i]);
                }
            }
        }
    }

    protected boolean find(Book book) {
        for (int i = 0; i < library.getBook().length; i++) {
            if (library.getBook()[i] != null) {
                if (library.getBook()[i].equals(book)) {
                    return true;
                }
            }

        }
        return false;
    }

    protected void take(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
    }

    protected void back(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null){
                if (books[i].equals(book)){
                    books[i] = null;
                    return;
                }
            }
        }

    }

    protected Book order(String nameBook, int dateOfPublication){
       return new Book(nameBook, dateOfPublication);
    }

    protected void bring(Book book) {
        for (int i = 0; i < library.getBook().length; i++) {
            if (library.getBook()[i] == null){
                library.getBook()[i] = book;
                return;
            }
        }
    }
}
