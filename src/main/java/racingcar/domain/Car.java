package racingcar.domain;

public class Car {

    public static final int START_POSITION = 0;
    public static final int MOVABLE_CONDITION = 4;

    private int position;
    private String name;

    public Car(String name) {
        this.name = name;
        this.position = START_POSITION;
    }

    public void forwardByCondition(int condition) {
        if (condition >= MOVABLE_CONDITION) {
            forward();
        }
    }

    private void forward() {
        this.position++;
    }

    public int getPosition() {
        return position;
    }
}
