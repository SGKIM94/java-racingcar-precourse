package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class RoundTest {

    @ParameterizedTest
    @ValueSource(ints = {-20, -1, 0})
    @DisplayName("경주 횟수가 0이하인 경우 예외처리한다.")
    void validateRound(int round) {
        assertThatIllegalArgumentException().isThrownBy(
                () -> new Round(round)
        ).withMessageContaining("경주 횟수는 0보다 커야합니다.");
    }
}
