package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {
    private List<Car> cars;
    private List<Integer> conditions;

    public RacingCars(List<Car> cars, List<Integer> conditions) {
        this.cars = cars;
        this.conditions = conditions;
    }

    public List<List<Record>> racing(int rounds) {
        return racingAllRoundAndRecord(rounds);
    }

    private List<List<Record>> racingAllRoundAndRecord(int rounds) {
        List<List<Record>> allRoundRecords = new ArrayList<>();

        for (int round = 0; round < rounds; round++) {
            forwardAllByConditions();
            allRoundRecords.add(recordAllRound());
        }

        return allRoundRecords;
    }

    private List<Record> recordAllRound() {
        List<Record> records = new ArrayList<>();

        for (Car car : cars) {
            records.add(new Record(car.getName(), car.getPosition()));
        }

        return records;
    }

    private void forwardAllByConditions() {
        int sizeOfCars = cars.size();

        for (int index = 0; index < sizeOfCars; index++) {
            Car currentCar = cars.get(index);
            currentCar.forwardByCondition(conditions.get(index));
        }
    }
}
