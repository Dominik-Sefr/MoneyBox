public class MoneyBox {
    private String name;

    public int getOnes() {
        return ones;
    }

    public int getTwos() {
        return twos;
    }

    private int ones;
    private int twos;

    public MoneyBox(String _name){
        name = _name;
        ones = 0;
        twos = 0;
    }
    public MoneyBox(String _name, int _ones, int _twos){
        name = _name;
        ones = _ones;
        twos = _twos;
    }
    public void rename(String newname){
        name = newname;
    }
    public int val(){
        return ones+twos;
    }
    public void insertOne(int times){
        ones += times;
    }
    public void insertTwo(int times){
        twos += times;
    }
    public void addBoth(int _ones, int _twos){
        ones += _ones;
        twos += _twos;
    }
    public String getBox(){
        String result = "V pokladničce " + name + " je " + ((int)ones+(twos*2)) + "Kč - " + ones +"×1Kč, "+ twos +"×2Kč";
        return result;
    }
    public boolean isItEnough(int price){
        if(price > (ones+(twos*2))){
            return false;
        }
        else{
            return true;
        }
    }

    public void setOnes(int ones) {
        this.ones = ones;
    }

    public void setTwos(int twos) {
        this.twos = twos;
    }
}
