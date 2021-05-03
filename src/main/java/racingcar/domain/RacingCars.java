package racingcar.domain;

public class RacingCars {

    public static final int START_ROUND = 0;

    private final Cars cars;
    private final ConditionGenerator conditions;

    public RacingCars(Cars cars, ConditionGenerator conditions) {
        this.cars = cars;
        this.conditions = conditions;
    }

    public OverallRecords racing(Round rounds) {
        return racingAllRoundAndRecord(rounds);
    }

    private OverallRecords racingAllRoundAndRecord(Round rounds) {
        OverallRecords allRoundRecords = new OverallRecords();

        for (int round = START_ROUND; round < rounds.getRound(); round++) {
            cars.forwardAllByConditions(conditions);
            allRoundRecords = allRoundRecords.add(cars.recordAll());
        }

        return allRoundRecords;
    }
}
