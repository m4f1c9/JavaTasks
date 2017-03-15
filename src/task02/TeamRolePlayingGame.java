package task02;

import java.util.Map;

public class TeamRolePlayingGame extends RolePlayingGame {

    Map<String, String> teams;

    public TeamRolePlayingGame() {
        name = "Командная Ролевая игра";
    }

    @Override
    void startGame() {
        super.startGame();
        System.out.println("Команды заданы");
    }

}
