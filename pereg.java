package task02;

class a{
    private int i;
    private int j;
    public String q(){
        return "q";
    }
    public String q(int i){
        return "w";
    }
    public String q(int j,int i){
        return "e";
    }
}
class b extends a{
    public String q(int i,int j,int o){
        return "1";
    }

}
public class pereg {
    public static void main(String[] args) {
        a father = new a();
        father.q();
        father.q(2);
        father.q(2,3);
        b  parent = new b();
        parent.q();
        parent.q(1,2,3);
        parent.q(1,2);
        parent.q(1);
    }
}
