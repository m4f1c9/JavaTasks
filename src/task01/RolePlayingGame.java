package task01;

import java.util.Map;

public class RolePlayingGame extends TabletopGame {

    Map<String, String> roles;

   @Override
    void startGame() {
        System.out.println("Настольная игра началась");
        System.out.println("Роли распределены");
    }

}
