import java.util.Scanner;

class Controller {

    private Controller() {
    }

    static String enteringInputFile() {
        ConsoleView.enteringInputFile();
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    static String enteringShiftValue() {
        ConsoleView.enteringShiftValue();
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

}
