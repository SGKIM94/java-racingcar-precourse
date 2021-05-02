package racingcar.domain;

public class Car {

    public static final int START_POSITION = 0;
    public static final int MOVABLE_CONDITION = 4;

    private Position position;
    private String name;

    public Car(String name) {
        this.name = name;
        this.position = new Position(START_POSITION);
    }

    public void forwardByCondition(int condition) {
        if (condition >= MOVABLE_CONDITION) {
            position.forward();
        }
    }

    public int getPosition() {
        return position.getPosition();
    }
}
