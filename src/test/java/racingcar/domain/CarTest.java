package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7, 8, 9})
    @DisplayName("4 이상 9이하인 값이면 전진한다.")
    void forwardByCondition(int condition) {
        Car car = new Car("kim");

        car.forwardByCondition(condition);

        assertThat(car.getPosition()).isEqualTo(1);
    }
}
