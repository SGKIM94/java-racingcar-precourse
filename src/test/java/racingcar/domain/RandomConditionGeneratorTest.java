package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomConditionGeneratorTest {

    @Test
    @DisplayName("1부터 9까지의 번호를 랜덤으로 생성한다.")
    void generator() {
        RandomConditionGenerator generator = new RandomConditionGenerator();

        Integer condition = generator.generate();

        assertThat(condition).isBetween(1, 10);
    }
}
