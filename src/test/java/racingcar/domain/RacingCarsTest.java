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
        RacingCars racingCars = new RacingCars(cars, Arrays.asList(4, 5, 9));

        List<Records> allRoundRecords = racingCars.racing(3);

        Records firstRecords = allRoundRecords.get(0);

        assertAll(
                () -> assertThat(allRoundRecords.size()).isEqualTo(3),
                () -> assertThat(firstRecords.size()).isEqualTo(3),
                () -> assertThat(firstRecords.get(0)).isNotNull(),
                () -> assertThat(firstRecords.get(1)).isNotNull(),
                () -> assertThat(firstRecords.get(2)).isNotNull()
        );
    }
}
