import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    List<Integer> evenList;
    List<Integer> oddList;
    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.evenList = new ArrayList<>(5000);
        main.oddList= new ArrayList<>(5000);

        EvenOddFinder e1 = new EvenOddFinder(1,main);
        Thread t1 = new Thread(e1);
        EvenOddFinder e2 = new EvenOddFinder(2,main);
        Thread t2 = new Thread(e2);
        EvenOddFinder e3 = new EvenOddFinder(3,main);
        Thread t3 = new Thread(e3);
        EvenOddFinder e4 = new EvenOddFinder(4,main);
        Thread t4= new Thread(e4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        Thread.sleep(1000);
        System.out.println(main.oddList.size());
        System.out.println(main.evenList.size());
        System.out.println(main.oddList);
        System.out.println(main.evenList);
    }
}
