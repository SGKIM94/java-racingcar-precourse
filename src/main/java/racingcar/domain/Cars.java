package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cars {

    public static final int START_INDEX = 0;

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    Records recordAll() {
        Records records = new Records();

        for (Car car : cars) {
            records = records.add(new Record(car.getName(), new Position(car.retrievePositionValue())));
        }

        return records;
    }

    void forwardAllByConditions(ConditionGenerator condition) {
        int sizeOfCars = cars.size();

        for (int index = START_INDEX; index < sizeOfCars; index++) {
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

    public List<CarName> findWinners() {
        List<Position> positions = addCarsPosition();

        Position maxPosition = Collections.max(positions, comparePosition());

        return addMaxPositionCarNames(maxPosition);
    }

    private List<Position> addCarsPosition() {
        List<Position> positions = new ArrayList<>();

        for (Car car : cars) {
            positions.add(car.getPosition());
        }

        return positions;
    }

    private List<CarName> addMaxPositionCarNames(Position maxPosition) {
        List<CarName> winners = new ArrayList<>();

        for (Car car : cars) {
            addMaxPositionCarName(maxPosition, winners, car);
        }

        return winners;
    }

    private void addMaxPositionCarName(Position maxPosition, List<CarName> winners, Car car) {
        if (car.getPosition() == maxPosition) {
            winners.add(car.getName());
        }
    }

    private Comparator<Position> comparePosition() {
        return Comparator.comparingInt(Position::getPosition);
    }
}
