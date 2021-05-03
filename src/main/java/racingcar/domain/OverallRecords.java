package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class OverallRecords {

    private final List<Records> overallRecords;

    public OverallRecords(List<Records> overallRecords) {
        this.overallRecords = overallRecords;
    }

    public OverallRecords() {
        this.overallRecords = new ArrayList<>();
    }

    public OverallRecords add(Records records) {
        overallRecords.add(records);
        return new OverallRecords(overallRecords);
    }

    public Records get(int index) {
        return overallRecords.get(index);
    }

    public int size() {
        return overallRecords.size();
    }

    public List<Records> getOverallRecords() {
        return overallRecords;
    }
}
