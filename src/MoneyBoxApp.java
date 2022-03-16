public class MoneyBoxApp {
    public static void main(String[] args) {
        MoneyBox Alice = new MoneyBox("Alice", 10, 5);
        MoneyBox Bob = new MoneyBox("Bob");
        Bob.insertOne(2);
        Bob.insertTwo(3);
        Bob.addBoth(5, 10);
        System.out.println(Alice.val());
        System.out.println(Bob.val());
        System.out.println(Alice.getBox());
        System.out.println(Bob.getBox());
        if(Alice.isItEnough(39)){
            System.out.println("Alice si může koupit burger");

        }
        if(Bob.isItEnough(39)){
            System.out.println("Bob si může koupit burger");
        }
        if(!(Bob.isItEnough(39) && Alice.isItEnough(39))){
            System.out.println("Nikdo si nemůže koupit burger");
        }
        if(Alice.val() > Bob.val()){
            System.out.println("Alice má více peněz");
        }

        else{
            System.out.println("Bob má více peněz");
        }
        Alice.setOnes(Bob.getOnes());
        Bob.setOnes(0);
        Alice.setTwos(Bob.getTwos());
        Bob.setTwos(0);
    }
}
