package racingcar.domain;

public class Car {

    public static final int START_POSITION = 0;

    private int position;
    private String name;

    public Car(String name) {
        this.name = name;
        this.position = START_POSITION;
    }

    public void forward() {
        this.position++;
    }

    public int getPosition() {
        return position;
    }

    public void forwardByCondition(int i) {
        if (i >= 4) {
            forward();
        }
    }
}
