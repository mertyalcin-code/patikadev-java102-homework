import java.util.Comparator;

public class BookNameComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if(!o1.getBookName().equals(o2.getBookName())){
            return o1.getBookName().compareTo(o2.getBookName());
        }else   return (o1.getPageNo()-(o2.getPageNo()))==0 ? 1 : -1;
    }
}
