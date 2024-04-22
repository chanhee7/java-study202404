package day10.abs;

public class Main {

    public static void main(String[] args) {

        Dog myDog = new Dog();
        Cat myCat = new Cat();
        GoldFish myGoldFish = new GoldFish();

        Pet[] petList = {myDog, myCat, myGoldFish};

        for (Pet pet : petList) {
            pet.eat();
            pet.sleep();
        }
    }
}
