package task02;

import java.util.Map;

public class RolePlayingGame extends TabletopGame {

    Map<String, String> roles;

    public RolePlayingGame() {
        name = "Ролевая игра";
    }

    @Override
    void startGame() {
        super.startGame();
        System.out.println("Роли распределены");
    }

}
