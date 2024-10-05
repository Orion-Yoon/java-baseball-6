package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player { // 플레이어에게 3가지 수를 입력받는 클래스
    Scanner scanner = new Scanner(System.in);
    List<Integer> playerNumber = new ArrayList<>();

    public void inputNumbers() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        System.out.println("숫자를 입력해주세요");

        while(playerNumber.size() < 3) {
            int number = scanner.nextInt(); // 사용자 입력 받기

            if (number < 1 || number > 9) {
                System.out.println("1부터 9 사이의 숫자를 입력하세요.");
                continue;
            }

            if (playerNumber.contains(number)) {
                System.out.println("중복된 숫자는 입력할 수 없습니다.");
                continue;
            }

            playerNumber.add(number);
        }

    }

    public List<Integer> getPlayerNumber() {
        return playerNumber;
    }
}
