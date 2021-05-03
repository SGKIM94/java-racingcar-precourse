package racingcar.domain;

public class RacingCars {

    public static final int START_ROUND = 0;
    private final Cars cars;
    private final ConditionGenerator conditions;

    public RacingCars(Cars cars, ConditionGenerator conditions) {
        this.cars = cars;
        this.conditions = conditions;
    }

    public OverallRecords racing(int rounds) {
        return racingAllRoundAndRecord(rounds);
    }

    private OverallRecords racingAllRoundAndRecord(int rounds) {
        OverallRecords allRoundRecords = new OverallRecords();

        for (int round = START_ROUND; round < rounds; round++) {
            cars.forwardAllByConditions(conditions);
            allRoundRecords = allRoundRecords.add(cars.recordAll());
        }

        return allRoundRecords;
    }
}
