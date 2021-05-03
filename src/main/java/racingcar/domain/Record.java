package racingcar.domain;

import java.util.Objects;

public class Record {

    private final CarName name;
    private final Position position;

    public Record(CarName name, Position position) {
        this.name = name;
        this.position = position;
    }

    public int retrieveCarPositionValue() {
        return position.getPosition();
    }

    public String retrieveCarNameValue() {
        return name.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return Objects.equals(name, record.name) && Objects.equals(position, record.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
