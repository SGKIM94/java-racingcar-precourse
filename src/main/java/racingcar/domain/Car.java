package racingcar.domain;

public class Car {

    public static final int START_POSITION = 0;
    public static final int MOVABLE_CONDITION = 4;
    public static final int NAME_MAX_LENGTH = 5;

    private Position position;
    private String name;

    public Car(String name) {
        validateNameLength(name);

        this.name = name;
        this.position = new Position(START_POSITION);
    }

    private void validateNameLength(String name) {
        if (name.length() >= NAME_MAX_LENGTH) {
            throw new IllegalArgumentException("이름의 길이가 너무 깁니다. : " + name.length());
        }
    }

    public void forwardByCondition(int condition) {
        if (condition >= MOVABLE_CONDITION) {
            position.forward();
        }
    }

    public Position getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
