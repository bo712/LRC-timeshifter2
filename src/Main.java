import controller.Controller;
import model.FileWorker;

public class Main {

    public static void main(String[] args) {

        String nameInFile = Controller.enteringInputFile();
        String nameOutFile = Controller.enteringOutputFile();
        String shiftValue = Controller.enteringShiftValue();

        FileWorker.read(nameInFile, shiftValue, nameOutFile);

    }

}
