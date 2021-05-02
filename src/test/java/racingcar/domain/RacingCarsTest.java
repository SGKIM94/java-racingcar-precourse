package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class RacingCarsTest {

    @Test
    @DisplayName("입력받은 횟수만큼 경주를 진행시킨다.")
    void racing() {
        List<Car> cars = Arrays.asList(new Car("kim"), new Car("park"), new Car("choi"));

        List<Record> record = RacingCars.racing(cars, 3, Arrays.asList(4, 5, 9));

        assertAll(
                () -> assertThat(record.size()).isEqualTo(3),
                () -> assertThat(record.get(0)).isNotNull(),
                () -> assertThat(record.get(1)).isNotNull(),
                () -> assertThat(record.get(2)).isNotNull()
        );
    }
}
