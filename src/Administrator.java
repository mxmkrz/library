public interface Administrator {
    void overdueNotification(ReaderImpl reader);
    boolean findBook(Book book);
}
