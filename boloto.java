package boloto;
class Amphibian{

    public String moveOnLand(){
        return "land";
    }
    public String   moveOnWater(){
        return "water";
    }
}
class Frog extends Amphibian{
    public String moveOnLand(){
        return "land2";
    }
    public String   moveOnWater(){
        return "water2";
    }
    public String sayKwa(){
        return "kwa";
    }
    // создать класс амфибия с 2 методами с мув он ленд  и мув он вотер
    // объект лягушка ссылка амфибия
    //2 переопределение методов в классе лягушки
    // добавить в лягушкеу метод сей ква и вызвать через переменную родительского типа
    // сделать даункастинг до фрога и повторить шаг 3
    // сделать класс тритона
    //  в род 3 перегруженных метода  + наследник и создать метод с таким же методом как в родительском
    public static void main(String[] args) {
        Amphibian frog = new Frog();
        frog.moveOnLand();
        frog.moveOnWater();
        //frog.sayKwa();

    }
}


