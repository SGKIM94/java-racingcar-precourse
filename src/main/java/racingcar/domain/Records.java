package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Records {

    private final List<Record> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    public Records(List<Record> records) {
        this.records = records;
    }

    public Records add(Record record) {
        records.add(record);
        return new Records(records);
    }

    public Record get(int index) {
        return records.get(index);
    }

    public int size() {
        return records.size();
    }

    public List<Record> getRecords() {
        return records;
    }
}
