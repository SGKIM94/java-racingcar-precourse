package racingcar.domain;

public class Car {

    public static final int START_POSITION = 0;
    public static final int MOVABLE_CONDITION = 4;

    private Position position;
    private String name;

    public Car(String name) {
        this.name = name;
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름의 길이가 너무 깁니다. : " + name.length());
        }

        this.position = new Position(START_POSITION);
    }

    public void forwardByCondition(int condition) {
        if (condition >= MOVABLE_CONDITION) {
            position.forward();
        }
    }

    public Position getPosition() {
        return position;
    }
}
