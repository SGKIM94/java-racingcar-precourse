package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7, 8, 9})
    @DisplayName("4 이상 9이하인 값이면 전진한다.")
    void forwardByCondition(int condition) {
        Car car = new Car("kim");

        car.forwardByCondition(condition);

        assertThat(car.getPosition()).isEqualTo(new Position(1));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    @DisplayName("3 이하의 값이면 멈춘다.")
    void nowForwardCondition(int condition) {
        Car car = new Car("kim");

        car.forwardByCondition(condition);

        assertThat(car.getPosition()).isEqualTo(new Position(0));
    }

    @ParameterizedTest
    @ValueSource(strings = {"longggName", "fiven"})
    @DisplayName("입력받은 이름이 5자이상인 경우 예외 처리한다.")
    void notValidateNameLength(String wrongName) {
        assertThatIllegalArgumentException().isThrownBy(
                () -> new Car(wrongName)
        ).withMessageContaining("이름의 길이가 너무 깁니다.");
    }

    @ParameterizedTest
    @ValueSource(strings = {"k", "ki", "kim", "four"})
    @DisplayName("이름이 5글자이하인 경우 예외가 발생하지 않는다")
    void validateNameLength(String correctName) {
        Car car = new Car(correctName);

        assertThat(car.getName()).isEqualTo(correctName);
    }
}
