package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    @DisplayName("자동차를 전진시키면 위치가 한칸 증가한다")
    void racing() {
        Car car = new Car("kim");

        car.forward();

        assertThat(car.getPosition()).isEqualTo(1);
    }
}
