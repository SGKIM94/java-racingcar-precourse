package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class CarsTest {

    public static final String TEST_NAME = "kim";
    public static final String TEST_SECOND_NAME = "park";

    private Cars cars;

    @BeforeEach
    void setUp() {
        cars = new Cars(Arrays.asList(new Car(TEST_NAME), new Car(TEST_SECOND_NAME)));
    }

    @Test
    @DisplayName("자동차들 경주의 기록을 저장한다.")
    void recordAll() {
        Records records = cars.recordAll();

        assertAll(
                () -> assertThat(records.size()).isEqualTo(2),
                () -> assertThat(records.get(0)).isEqualTo(newRecordByName(TEST_NAME)),
                () -> assertThat(records.get(1)).isEqualTo(newRecordByName(TEST_SECOND_NAME))
        );
    }

    private Record newRecordByName(String name) {
        return new Record(new CarName(name), new Position());
    }

    @Test
    @DisplayName("특정 조건에 따라 모든 자동차를 전진시킨다.")
    void forwardAllByConditions() {
        cars.forwardAllByConditions(new MockConditionGenerator(Arrays.asList(3, 9)));

        assertAll(
                () -> assertThat(cars.getPositionByIndex(0)).isEqualTo(new Position(0)),
                () -> assertThat(cars.getPositionByIndex(1)).isEqualTo(new Position(1))
        );
    }

    @Test
    @DisplayName("자동차 경주 후 누가 우승했는지를 알려준다.")
    void findWinners() {
        List<CarName> winners = cars.findWinners();

        assertThat(winners.size()).isGreaterThan(0);
    }
}
