package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Record> recordAllRound() {
        return recordAllCars();
    }

    private List<Record> recordAllCars() {
        List<Record> records = new ArrayList<>();

        for (Car car : cars) {
            records.add(new Record(car.getName(), car.getPosition()));
        }

        return records;
    }

    public void forwardAllByConditions(List<Integer> conditions) {
        int sizeOfCars = cars.size();

        for (int index = 0; index < sizeOfCars; index++) {
            Car currentCar = cars.get(index);
            currentCar.forwardByCondition(conditions.get(index));
        }
    }
}
