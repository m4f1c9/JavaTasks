package task01;

import java.util.List;

public class TabletopGame {

    String name = "Настольная игра";
    List<String> players;
    String rules;

    public void setName(String name) {
        this.name = name;
    }

    void startGame() {
        System.out.println(name + " началась");
    }
}
