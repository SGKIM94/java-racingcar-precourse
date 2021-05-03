package racingcar.domain;

public class Round {

    public static final int MINIMUM_ROUND_VALUE = 0;

    private final int round;

    public Round(int round) {
        validateRound(round);

        this.round = round;
    }

    private void validateRound(int round) {
        if (round <= MINIMUM_ROUND_VALUE) {
            throw new IllegalArgumentException("경주 횟수는 0보다 커야합니다. : + " + round);
        }
    }

    public int getRound() {
        return round;
    }
}
