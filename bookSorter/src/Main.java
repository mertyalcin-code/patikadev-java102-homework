import java.util.Date;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> booksOrderWithName = new TreeSet<>(new BookNameComparator());
        booksOrderWithName.add(new Book("c",20,"mert",new Date()));
        booksOrderWithName.add(new Book("d",33,"mert",new Date()));
        booksOrderWithName.add(new Book("c",11,"mert",new Date()));
        booksOrderWithName.add(new Book("r",20,"mert",new Date()));
        booksOrderWithName.add(new Book("z",22,"mert",new Date()));
        for (Book book:booksOrderWithName
             ) {
            System.out.println(book.getBookName()+" "+book.getPageNo());
        }
        System.out.println("-----------");
        TreeSet<Book> booksOrderWithPageNo= new TreeSet<>(new BookPageNoComparator());
        booksOrderWithPageNo.add(new Book("c",20,"mert",new Date()));
        booksOrderWithPageNo.add(new Book("d",33,"mert",new Date()));
        booksOrderWithPageNo.add(new Book("c",11,"mert",new Date()));
        booksOrderWithPageNo.add(new Book("r",20,"mert",new Date()));
        booksOrderWithPageNo.add(new Book("z",22,"mert",new Date()));
        for (Book book:booksOrderWithPageNo
        ) {
            System.out.println(book.getBookName()+" "+book.getPageNo());
        }
    }
}
