import viewer.MainWindow;

public class Main {

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        String nameInFile = Controller.enteringInputFile();
        String shiftValue = Controller.enteringShiftValue();

//        String nameInFile = mainWindow.getInputPath();
//        String shiftValue = mainWindow.getOutputFile();

        ReadWriteFiles.read(nameInFile, shiftValue);
    }
}
