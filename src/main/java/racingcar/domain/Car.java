package racingcar.domain;

public class Car {

    public static final int START_POSITION = 0;
    public static final int MOVABLE_CONDITION = 4;

    private Position position;
    private CarName name;

    public Car(String name) {
        this.name = new CarName(name);
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

    public CarName getName() {
        return name;
    }
}
