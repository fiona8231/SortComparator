import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Book implements Comparable{

    int id;
    String name;
    private String author;
    double price;
    public GregorianCalendar calendar;

    public Book(int newId, String newName, String newAuthor, double newPrice, GregorianCalendar newCalendar){

        this.id = newId;
        this.name = newName;
        this.author = newAuthor;
        this.price = newPrice;
        this.calendar = newCalendar;

    }

   // public Book(){
       // this(0, "X", " ", 0.00, new GregorianCalendar());
   // }

    public String toString(){
       String showString = id + " " + name + " " + author + "   ";

        DecimalFormat showPrice = new DecimalFormat("0.00   ");
        showString += showPrice.format(price);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日  ");
        showString += dateFormat.format(calendar.getTime());

        return showString;
    }


    @Override
    public int compareTo(Object obj) {
        Book book = (Book) obj;

        //Compare according to book id
        return  this.id - book.id;
    }
}
