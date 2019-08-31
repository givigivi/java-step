import javax.crypto.Cipher;

class Point{
    public String draw(){
        return "point";
    }
}
class Line extends Point{
    public String draw(){
        return "Line";
    }
}
class Circle extends Point{
    public String draw(){
        return "circle";
    }
}

public class qwe {

    public static void main(String[] args) {
        Point [] p = new Point[1000];
        p[0] = new  Circle();
        p[1] = new  Line();

        for(int i = 0; i<p.length;i++){
            if (p[i]!=null){
                p[i].draw();
            }
        }
    }
}
