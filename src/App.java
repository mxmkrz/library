public class App {
    public static void main(String[] args) {

        Book book = new Book("Rabbit",1997);
        Book book1 = new Book("Master and Margarita",1990);
        Book book2 = new Book("Kind ",1995);

        Library library = new Library(200);
        ReaderImpl reader = new ReaderImpl("Petr");

        reader.takeBook(book);
        reader.takeBook(book1);
        reader.takeBook(book2);
        System.out.println(reader);

        AdminImpl admin = new AdminImpl("Ivan",library);
        admin.overdueNotification(reader);

        SupplierImpl supplier = new SupplierImpl("Alex",library);
        supplier.bringBook(book1);
        supplier.bringBook(book2);

        System.out.println(supplier);
        System.out.println( admin.findBook(book));

        Book book3 = admin.orderBook("Lev",1990);
        supplier.bringBook(book3);











    }
}
