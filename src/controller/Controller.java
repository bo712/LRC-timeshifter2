package controller;

import viewer.ConsoleView;

import java.util.Scanner;

public class Controller {

    public static String enteringInputFile() {
        ConsoleView.enteringInputFile();
        Scanner in = new Scanner(System.in);
        String ttt = in.nextLine();
        System.out.println(ttt);
        return ttt;
    }

    public static String enteringOutputFile() {
        ConsoleView.enteringOutputFile();
        Scanner in = new Scanner(System.in);
        return in.nextLine().concat("/out.lrc");
    }

    public static String enteringShiftValue() {
        ConsoleView.enteringShiftValue();
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

}
