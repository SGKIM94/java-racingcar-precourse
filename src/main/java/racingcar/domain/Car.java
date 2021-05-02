package racingcar.domain;

public class Car {

    public static final int MOVABLE_CONDITION = 4;

    private final Position position;
    private final CarName name;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new Position();
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
