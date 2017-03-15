package task02;

public class Main {

    public static void main(String[] args) {
            
        
        TabletopGame[] games = {new TabletopGame(),new RolePlayingGame(), new TeamRolePlayingGame(), new HiddenRoleGame()};
        for (TabletopGame game : games) {
                game.startGame();
                System.out.println("---------------------------");
        }
    }

}
