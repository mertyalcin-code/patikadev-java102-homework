import java.util.ArrayList;
import java.util.List;

public class Brand {
    private int id;
    private String name;

    public static List<Brand> getBrands(){
        List<Brand> list = new ArrayList<>();
        list.add(new Brand(0,"Samsung"));
        list.add(new Brand(1,"Lenovo"));
        list.add(new Brand(2,"Apple"));
        list.add(new Brand(3,"Huawei"));
        list.add(new Brand(4,"Casper"));
        list.add(new Brand(5,"Asus"));
        list.add(new Brand(6,"HP"));
        list.add(new Brand(7,"Xiaomi"));
        list.add(new Brand(8,"Monster"));
        return list;
    }

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
