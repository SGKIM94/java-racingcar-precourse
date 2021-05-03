package racingcar.domain;

import java.util.Objects;

public class CarName {

    public static final int NAME_MAX_LENGTH = 5;

    private final String name;

    public CarName(String name) {
        validateNameLength(name);
        this.name = name;
    }

    private void validateNameLength(String name) {
        if (name.length() >= NAME_MAX_LENGTH) {
            throw new IllegalArgumentException("이름의 길이가 너무 깁니다. : " + name.length());
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarName carName = (CarName) o;
        return Objects.equals(name, carName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
