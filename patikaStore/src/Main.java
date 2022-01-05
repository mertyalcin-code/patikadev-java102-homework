import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue=true;
        int choice = -1;
        int choiceSub=-1;
        ProductManager productManager = new ProductManager();
        while (true){
            if (choice==-1){

                System.out.println("PatikaStore Ürün Yönetim Paneli !");
                System.out.println("1 - Laptop İşlemleri");
                System.out.println("2 - Cep Telefonu İşlemleri");
                System.out.println("3 - Marka Listele");
                System.out.println("0 - Çıkış Yap");
                System.out.print("Tercihiniz:");
                choice=scanner.nextInt();



               if(choice<0 || choice>3){
                   choice=-1;
                   System.out.println("--------------");
                   System.out.println("Hatalı İşlem");
                   System.out.println("---------------");
                   continue;
               }
                if(choice == 0){
                    break;
                }
            }
            if(choice==3){
                System.out.println("----\n Markalarımız\n----");
                for(Brand brand :Brand.getBrands()){
                    System.out.println(brand.getName());
                }
                break;
            }
            if(choice==1){
                System.out.println("Patika Store Notebook İşlemleri !");
                System.out.println("1 - Listele");
                System.out.println("2 - Ekle");
                System.out.println("3 - Sil");
                System.out.println("4 - Id ile Bul");
                System.out.println("5 - Marka ile Bul");
                System.out.println("0 - Ana Menü");
                System.out.print("Tercihiniz:");
                choiceSub=scanner.nextInt();
                if(choiceSub==1){
                    productManager.listProductsByCategory("Laptop");
                }
                if(choiceSub==2){
                    System.out.print("id:");
                   int id = scanner.nextInt();
                }
                if(choiceSub==3){

                }
                if(choiceSub==5){

                }
                if(choiceSub==0){
                    choice=-1;
                    choiceSub=-1;
                    continue;
                }
            }
        }
    }
}
