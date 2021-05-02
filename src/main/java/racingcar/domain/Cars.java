package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    List<Record> recordAll() {
        List<Record> records = new ArrayList<>();

        for (Car car : cars) {
            records.add(new Record(car.getName(), car.getPosition()));
        }

        return records;
    }

    void forwardAllByConditions(List<Integer> conditions) {
        int sizeOfCars = cars.size();

        for (int index = 0; index < sizeOfCars; index++) {
            Car currentCar = getCarByIndex(index);
            currentCar.forwardByCondition(conditions.get(index));
        }
    }

    public Position getPositionByIndex(int index) {
        return getCarByIndex(index).getPosition();
    }

    private Car getCarByIndex(int index) {
        return cars.get(index);
    }
}
