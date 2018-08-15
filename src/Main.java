import controller.Controller;
import model.ReadWriteFiles;

public class Main {

    public static void main(String[] args) {

        String nameInFile = Controller.enteringInputFile();
        String nameOutFile = Controller.enteringOutputFile();
        String shiftValue = Controller.enteringShiftValue();

        ReadWriteFiles.read(nameInFile, shiftValue, nameOutFile);
    }
}
