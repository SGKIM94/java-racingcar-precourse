package racingcar.domain;

public class Position {

    private int position;

    public Position(int position) {
        this.position = position;
    }

    public void forward() {
        this.position++;
    }

    public int getPosition() {
        return position;
    }
}
