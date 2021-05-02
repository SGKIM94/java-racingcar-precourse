package racingcar.domain;

import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    Records recordAll() {
        Records records = new Records();

        for (Car car : cars) {
            records = records.add(new Record(car.getName(), car.getPosition()));
        }

        return records;
    }

    void forwardAllByConditions(ConditionGenerator condition) {
        int sizeOfCars = cars.size();

        for (int index = 0; index < sizeOfCars; index++) {
            Car currentCar = getCarByIndex(index);
            currentCar.forwardByCondition(condition.generate());
        }
    }

    public Position getPositionByIndex(int index) {
        return getCarByIndex(index).getPosition();
    }

    private Car getCarByIndex(int index) {
        return cars.get(index);
    }
}
