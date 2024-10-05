package baseball;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Player player = new Player();
        Referee referee = new Referee();
        List<Integer> computerNumber = NumberGenerator.computerNumber();

        player.inputNumbers();
        referee.compare(player.getPlayerNumber(),computerNumber);
    }
}
