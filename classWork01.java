enum CoffeSize{
    BIG(8,"sdf"),HUGE(10,"asd"),OVERWHELMING(16,"asd");
    CoffeSize(int ounces,String str){
        this.ounces =ounces;
        this.name = str;
    }
    private int ounces;
    private String name;
    public int getOunces(){
        return ounces;
    }
    public String getStr(){
        return name;
    }
}
class Coffe{
    CoffeSize size;
}
public class classWork01 {
    public static void main(String[] args) {
        Coffe drink1 = new Coffe();
        drink1.size = CoffeSize.BIG;

        Coffe drink2 = new Coffe();
        drink2.size = CoffeSize.HUGE;

        Coffe drink3 = new Coffe();
        drink3.size = CoffeSize.OVERWHELMING;
        System.out.println(drink1.size);
        System.out.println(drink1.size.getOunces());
        for (CoffeSize value:CoffeSize.values()
             ) {
            System.out.print(value+ " ");
            System.out.println(value.getOunces());
        }
        for (CoffeSize str:CoffeSize.values()
             ) {
            System.out.print(str +" ");
            System.out.print(str.getOunces()+" ");
            System.out.println(str.getStr());

        }
    }
}
