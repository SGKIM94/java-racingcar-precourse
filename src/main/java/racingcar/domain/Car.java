package racingcar.domain;

public class Car {

    private int position;
    private String name;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public void forward() {
        this.position++;
    }

    public int getPosition() {
        return position;
    }
}
