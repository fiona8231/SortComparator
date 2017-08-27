import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.TreeMap;

public class Test {

    public static void main(String[] args) {

        // int newId, String newName, String newAuthor, double newPrice, GregorianCalendar newCalend

        Book b1 = new Book(1, "computer book", "Sherry", 23.00, new GregorianCalendar(2001, 03, 04));
        Book b2 = new Book(3, "animal book", "Ashily", 103.00, new GregorianCalendar(1990, 01, 11));
        Book b3 = new Book(12, "vege book", "Fion", 55.00, new GregorianCalendar(1984, 3, 01));
        Book b4 = new Book(34, "DIY book", "Fargo", 99.00, new GregorianCalendar(20007, 03, 04));
        Book b5 = new Book(104, "cooking book", "Lucy", 13.00, new GregorianCalendar(2013, 8, 22));

        TreeMap Map = new TreeMap();
        Map.put(b1, new Integer(225));
        Map.put(b2, new Integer(122));
        Map.put(b3, new Integer(668));
        Map.put(b4, new Integer(453));
        Map.put(b5, new Integer(40));

        Iterator iterator = Map.keySet().iterator();

        Object key = null;
        Object value = null;
        Book bb = null;
        while (iterator.hasNext()){
         key = iterator.next();
         bb = (Book) key;
         value =  Map.get(key);

            System.out.println(bb.toString() + "Storage: "+ Map.get(key));




        }


    }
}