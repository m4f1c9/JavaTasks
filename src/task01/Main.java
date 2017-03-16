package task01;

public class Main {

    public static void main(String[] args) {
        TabletopGame[] ttg = {new TabletopGame(), new RolePlayingGame(), new RolePlayingGame(), new TeamRolePlayingGame()};

        for (TabletopGame game : ttg) {
            game.startGame();
            System.out.println("---------------");
        }
        
        
    }

}
