package racingcar.domain;

import java.util.LinkedList;
import java.util.List;

public class MockConditionGenerator implements ConditionGenerator {

    private final LinkedList<Integer> conditions;

    public MockConditionGenerator(List<Integer> conditions) {
        this.conditions = new LinkedList<>(conditions);
    }

    @Override
    public Integer generate() {
        return conditions.pop();
    }
}
