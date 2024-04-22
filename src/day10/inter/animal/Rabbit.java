package day10.inter.animal;

public class Rabbit extends Animal implements Pet, Wild {
    @Override
    public void handle() {
        this.age = 10;
    }

    @Override
    public boolean inject() {
        return false;
    }

    @Override
    public void violent() {

    }

    // 사냥 기능 없음

    // 난폭한 성격

    // 애완동물로 키우기 가능
}
