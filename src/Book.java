import java.time.LocalDate;
import java.util.Calendar;
import java.util.Objects;

public class Book {

    private String name;
    private int dateOfPublication;
    private LocalDate timeOfDelay;
    private LocalDate timeOfCreate;

    public Book(String name, int dateOfPublication) {
        this.name = name;
        this.dateOfPublication = dateOfPublication;
        this.timeOfDelay = LocalDate.of(Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH) + 2,
                Calendar.getInstance().get(Calendar.DATE));
        System.out.println(timeOfDelay);
        this.timeOfCreate = LocalDate.now();
    }




    public LocalDate getTimeOfDelay() {
        return timeOfDelay;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return dateOfPublication == book.dateOfPublication && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfPublication);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", dateOfPublication=" + dateOfPublication +
                ", timeOfDelay=" + timeOfDelay +
                ", timeOfCreate=" + timeOfCreate +
                '}';
    }
}
