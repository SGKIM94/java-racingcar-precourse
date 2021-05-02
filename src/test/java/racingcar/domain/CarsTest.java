package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class CarsTest {

    private Cars cars;

    @BeforeEach
    void setUp() {
        cars = new Cars(Arrays.asList(new Car("kim"), new Car("park")));
    }

    @Test
    @DisplayName("자동차들 경주의 기록을 저장한다.")
    void recordAll() {
        List<Record> records = cars.recordAll();

        assertAll(
                () -> assertThat(records.size()).isEqualTo(2),
                () -> assertThat(records).containsExactlyInAnyOrder(
                        new Record(new CarName("kim"), new Position()),
                        new Record(new CarName("park"), new Position())
                )
        );
    }

    @Test
    @DisplayName("특정 조건에 따라 모든 자동차를 전진시킨다.")
    void forwardAllByConditions() {
        cars.forwardAllByConditions(new Conditions(Arrays.asList(3, 9)));

        assertAll(
                () -> assertThat(cars.getPositionByIndex(0)).isEqualTo(new Position(0)),
                () -> assertThat(cars.getPositionByIndex(1)).isEqualTo(new Position(1))
        );
    }
}
