public class Main {

    public static void main(String[] args) {
        String nameInFile = Controller.enteringInputFile();
        String shiftValue = Controller.enteringShiftValue();

        ReadWriteFiles.read(nameInFile, shiftValue);
    }
}