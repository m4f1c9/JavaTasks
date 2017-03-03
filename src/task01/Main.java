package task01;

public class Main {

    public static void main(String[] args) {
        TabletopGame game = new TabletopGame();
        game.startGame();
        RolePlayingGame game1 = new RolePlayingGame();
        game1.startGame();
        RolePlayingGame game2 = new TeamRolePlayingGame();
        game2.startGame();
        
    }

}
