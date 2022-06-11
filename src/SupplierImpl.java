import java.util.Arrays;

public class SupplierImpl extends User  implements Supplier,Reader{


    public SupplierImpl(String name, Library library) {
        super(name, library);
    }

    @Override
    public void bringBook(Book book) {
       bring(book);
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
        return "SupplierImpl{" +
                "library=" + library +
                ", name='" + name + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
