import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("b",120,"ahmet",new Date()));
        books.add(new Book("a",55,"ahmet",new Date()));
        books.add(new Book("d",2333,"ahmet",new Date()));
        books.add(new Book("e",222,"ahmet",new Date()));
        books.add(new Book("c",233,"ahmet",new Date()));
        books.add(new Book("g",120,"ahmet",new Date()));
        books.add(new Book("f",1321,"ahmet",new Date()));
        books.add(new Book("h",1220,"ahmet",new Date()));
        books.add(new Book("j",1231,"ahmet",new Date()));
        books.add(new Book("i",11120,"ahmet",new Date()));
        HashMap<String ,String> map = new HashMap<>();
        books.stream().forEach(book -> map.put(book.getName(),book.getAuthor()));
        List<Book> filteredList = new ArrayList<>();
        books.stream().filter(book -> book.getPageNo()>100).forEach(book -> filteredList.add(book));
    }
}
