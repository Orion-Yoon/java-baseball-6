package baseball;

import java.util.List;

public class Referee {
   public void compare(List<Integer> playerNumber, List<Integer> computerNumber) {
       int strike = 0;
       int ball = 0;

       for (int i = 0; i < 3; i++) {
           if(playerNumber.get(i).equals(computerNumber.get(i)))
               strike++;
       }

       for (int i = 0; i < 3; i++) {
           if (!playerNumber.get(i).equals(computerNumber.get(i)) && computerNumber.contains(playerNumber.get(i)))
               ball++;

       }
       System.out.println(ball + "볼" + strike + "스트라이크");
   }

}
