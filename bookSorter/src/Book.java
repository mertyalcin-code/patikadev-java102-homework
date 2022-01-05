import java.util.Comparator;
import java.util.Date;

public class Book{
    private String bookName;
    private int pageNo;
    private String author;
    private Date date;

    public Book(String bookName, int pageNo, String author, Date date) {
        this.bookName = bookName;
        this.pageNo = pageNo;
        this.author = author;
        this.date = date;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
