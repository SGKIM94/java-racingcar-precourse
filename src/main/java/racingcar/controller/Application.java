package racingcar.controller;

import racingcar.domain.*;
import racingcar.view.InputView;
import racingcar.view.Receipt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static final String DELIMITER_CAR_NAME = ",";

    public static void main(String[] args) {
        Scanner scanner = Receipt.makeScanner();

        InputView.printToInputCarNames();
        Cars createdCars = receiptNamesAndCreateCars(scanner);

        InputView.printToInputRound();
        int round = Receipt.receiptRound(scanner);

        InputView.printToIntroRacingResult();

        raceAndPrintResult(round, createdCars);

        findWinnersAndPrint(createdCars);
    }

    private static void findWinnersAndPrint(Cars createdCars) {
        Winners winners = createdCars.findWinners();
        InputView.printWinners(winners.getWinners());
        InputView.printEndingToWinners();
    }

    private static void raceAndPrintResult(int round, Cars createdCars) {
        RacingCars racingCars = new RacingCars(createdCars, new RandomConditionGenerator());

        OverallRecords racingResult = racingCars.racing(round);

        InputView.printRacingResult(racingResult.getOverallRecords());
    }

    private static Cars receiptNamesAndCreateCars(Scanner scanner) {
        String names = Receipt.receiptCarNames(scanner);

        return new Cars(generateCars(names.split(DELIMITER_CAR_NAME)));
    }

    private static List<Car> generateCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();

        for (String name: carNames) {
            cars.add(new Car(name));
        }

        return cars;
    }
}
