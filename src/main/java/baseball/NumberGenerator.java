package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {
    static final List<Integer> computerNumber() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < 3) {
            int number = Randoms.pickNumberInRange(1,9);
            if(numbers.contains(number)) {
                continue;
            }else{
                numbers.add(number);
            }

        }
//        for (int i = 0; i < 3; i++) {
//            int number = Randoms.pickNumberInRange(1,9);
//            numbers.add(number);
//        }

        return numbers;
    }

}
