package controller;

import view.ConsoleView;
import java.util.Scanner;

public class Controller {

    public static String enteringInputFile() {
        ConsoleView.enteringInputFile();
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static String enteringShiftValue() {
        ConsoleView.enteringShiftValue();
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

}
