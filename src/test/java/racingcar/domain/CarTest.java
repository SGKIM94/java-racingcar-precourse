package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    @DisplayName("자동차를 전진시키면 위치가 한칸 증가한다.")
    void forward() {
        Car car = new Car("kim");

        car.forward();

        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("4 이상의의 값이면 전진한다.")
    void forwardByCondition() {
        Car car = new Car("kim");

        car.forwardByCondition(10);

        assertThat(car.getPosition()).isEqualTo(1);
    }
}
