import java.util.Comparator;

public class BookPageNoComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if(o1.getPageNo()!=o2.getPageNo()){
            return o1.getPageNo()-o2.getPageNo();
        }
        else {
           return o1.getBookName().compareTo(o2.getBookName())==0 ? -1 : 1;
        }
    }
}
