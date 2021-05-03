package racingcar.view;

import java.util.Scanner;

public class Receipt {

    public static int receiptRound(Scanner scanner) {
        return scanner.nextInt();
    }

    public static String receiptCarNames(Scanner scanner) {
        return scanner.next();
    }

    public static Scanner makeScanner() {
        return new Scanner(System.in);
    }
}
