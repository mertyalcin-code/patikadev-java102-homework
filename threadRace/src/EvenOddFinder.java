import java.util.ArrayList;
import java.util.List;

public class EvenOddFinder implements Runnable{
    List<Integer> refList;
    Main main;
    public EvenOddFinder(int id,Main main) {
        this.main=main;
        List<Integer> list =new ArrayList<>();
        for (int i = 1; i <10001 ; i++) {
            list.add(i);
        }
        if(id==1){
            refList=new ArrayList<>(list.subList(0,2500));
        }
        if(id==2){
            refList =new ArrayList<>(list.subList(2500,5000));
        }
        if(id==3){
            refList=new ArrayList<>(list.subList(5000,7500));
        }
        if(id==4){
            refList =new ArrayList<>(list.subList(7500,10000));
        }
    }

    @Override
    public  void run(){
        for(Integer i :refList){
            if(i%2==0){
                synchronized (this.main.evenList) {
                    this.main.evenList.add(i);
                }
            }
            if(i%2==1){
                synchronized (this.main.oddList) {
                    this.main.oddList.add(i);
                }
            }
        }

    }

}
