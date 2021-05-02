package racingcar.domain;

import java.util.List;

public class Conditions {

    private final List<Integer> conditions;

    public Conditions(List<Integer> conditions) {
        this.conditions = conditions;
    }

    public int get(int index) {
        return conditions.get(index);
    }
}
