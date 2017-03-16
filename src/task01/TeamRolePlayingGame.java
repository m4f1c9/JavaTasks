package task01;

import java.util.Map;

public class TeamRolePlayingGame extends RolePlayingGame {

    Map<String, String> teams;

    @Override
    void startGame() {
 
        System.out.println("Командная Ролевая игра началась");
        System.out.println("Команды заданы");
    }

}
