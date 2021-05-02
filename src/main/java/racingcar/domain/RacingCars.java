package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {

    public static List<Record> racing(List<Car> cars, int attempts, List<Integer> conditions) {
        List<Record> records = new ArrayList<>();

        int sizeOfCars = cars.size();

        for (int i = 0; i < attempts; i++) {
            for (int j = 0; j < sizeOfCars; j++) {
                Car currentCar = cars.get(i);
                currentCar.forwardByCondition(conditions.get(i));
            }
        }

        for (Car car : cars) {
            records.add(new Record(car.getName(), car.getPosition()));
        }

        return records;
    }
}
