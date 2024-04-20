package day07.player;

public class Main {

    public static void main(String[] args) {

        /*
                       Object
                         |
                       Player
                   /     |   \
                Warrior Mage Hunter

         */

        Warrior w = new Warrior("전사");
        Mage m = new Mage("법사");
        Hunter h = new Hunter("헌터");

        w.showStatus();
        m.showStatus();
        h.showStatus();

        // 썬더볼트는 여러 플레이어를 대상으로 공격하는 스킬이다.
        // 1. 자기 자신이 대상이 되면 자기 자신은 피해를 입지 않는다
        // 2. 타겟이 된 대상은 10 ~ 15 랜덤 피해를 입고 실제로 체력이 감소한다
        m.thunderbolt(w, h, m,
                new Mage("법사2")
                , new Warrior("전사2")
                );
    }
}