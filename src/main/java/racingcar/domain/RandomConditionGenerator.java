package racingcar.domain;

import java.util.Random;

public class RandomConditionGenerator implements ConditionGenerator {

    public static final int MIN_RANDOM_NUMBER = 1;
    public static final int MAX_RANDOM_NUMBER = 10;

    private final Random random = new Random();

    @Override
    public Integer generate() {
        return random.nextInt(MAX_RANDOM_NUMBER - MIN_RANDOM_NUMBER) + MIN_RANDOM_NUMBER;
    }
}
