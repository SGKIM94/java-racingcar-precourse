package racingcar.view;

import racingcar.domain.CarName;
import racingcar.domain.Record;
import racingcar.domain.Records;

import java.util.List;

import static racingcar.controller.Application.DELIMITER_CAR_NAME;

public class InputView {

    public static final String CAR_POSITION_DISPLAY = "-";
    public static final int START_INDEX = 0;

    public static void printWinners(List<CarName> winners) {
        for (CarName winner : winners) {
            System.out.print(winner.getName() + DELIMITER_CAR_NAME);
        }
    }

    public static void printEndingToWinners() {
        System.out.println("가 최종 우승했습니다.");
    }

    public static void printRacingResult(List<Records> overallRecords) {
        for (Records records : overallRecords) {
            printRecords(records);
            lineBreak();
        }
    }

    public static void printRecords(Records records) {
        for (Record record : records.getRecords()) {
            printCarName(record);

            printCarPositions(record);

            lineBreak();
        }
    }

    private static void printCarName(Record record) {
        System.out.print(record.retrieveCarNameValue() + ": ");
    }

    private static void printCarPositions(Record record) {
        for (int i = START_INDEX; i < record.retrieveCarPositionValue(); i++) {
            System.out.print(CAR_POSITION_DISPLAY);
        }
    }

    public static void lineBreak() {
        System.out.println();
    }

    public static void printToIntroRacingResult() {
        System.out.println("실행 결과");
    }

    public static void printToInputRound() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void printToInputCarNames() {
        System.out.println("경자할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }
}
