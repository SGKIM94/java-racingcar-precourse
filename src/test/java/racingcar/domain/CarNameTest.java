package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class CarNameTest {

    @ParameterizedTest
    @ValueSource(strings = {"longggName", "fiven"})
    @DisplayName("입력받은 이름이 5자이상인 경우 예외 처리한다.")
    void notValidateNameLength(String wrongName) {
        assertThatIllegalArgumentException().isThrownBy(
                () -> new CarName(wrongName)
        ).withMessageContaining("이름의 길이가 너무 깁니다.");
    }

    @ParameterizedTest
    @ValueSource(strings = {"k", "ki", "kim", "four"})
    @DisplayName("이름이 5글자이하인 경우 예외가 발생하지 않는다")
    void validateNameLength(String correctName) {
        CarName car = new CarName(correctName);

        assertThat(car.getName()).isEqualTo(correctName);
    }
}
