package racingcar.domain;

import java.util.List;

public class RacingCars {

    private final Cars cars;
    private final ConditionGenerator conditions;

    public RacingCars(List<Car> cars, ConditionGenerator conditions) {
        this.cars = new Cars(cars);
        this.conditions = conditions;
    }

    public OverallRecords racing(int rounds) {
        return racingAllRoundAndRecord(rounds);
    }

    private OverallRecords racingAllRoundAndRecord(int rounds) {
        OverallRecords allRoundRecords = new OverallRecords();

        for (int round = 0; round < rounds; round++) {
            cars.forwardAllByConditions(conditions);
            allRoundRecords = allRoundRecords.add(cars.recordAll());
        }

        return allRoundRecords;
    }
}
