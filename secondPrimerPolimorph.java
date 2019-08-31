
// пример полиморфизма через вызов метода (2)
class Instr {
    public static void tune(Instr instr) {
        instr.play(); 
    }

    void play() {

    }
}
class Wind extends Instr{
    @Override
    void play() {
        System.out.println("Du-du-duu");
        }

    }
class Guitar extends Instr{
    @Override
    void play() {
        System.out.println(" brum-brum");
    }
}


public class secondPrimerPolimorph {
    public static void main(String[] args) {
        Wind wind = new Wind();
        Instr.tune(wind);
     }
}
