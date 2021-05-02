package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {

    private final Cars cars;
    private final List<Integer> conditions;

    public RacingCars(List<Car> cars, List<Integer> conditions) {
        this.cars = new Cars(cars);
        this.conditions = conditions;
    }

    public List<List<Record>> racing(int rounds) {
        return racingAllRoundAndRecord(rounds);
    }

    private List<List<Record>> racingAllRoundAndRecord(int rounds) {
        List<List<Record>> allRoundRecords = new ArrayList<>();

        for (int round = 0; round < rounds; round++) {
            cars.forwardAllByConditions(conditions);
            allRoundRecords.add(cars.recordAllRound());
        }

        return allRoundRecords;
    }
}
