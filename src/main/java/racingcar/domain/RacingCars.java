package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {

    private final Cars cars;
    private final Conditions conditions;

    public RacingCars(List<Car> cars, List<Integer> conditions) {
        this.cars = new Cars(cars);
        this.conditions = new Conditions(conditions);
    }

    public List<Records> racing(int rounds) {
        return racingAllRoundAndRecord(rounds);
    }

    private List<Records> racingAllRoundAndRecord(int rounds) {
        List<Records> allRoundRecords = new ArrayList<>();

        for (int round = 0; round < rounds; round++) {
            cars.forwardAllByConditions(conditions);
            allRoundRecords.add(cars.recordAll());
        }

        return allRoundRecords;
    }
}
