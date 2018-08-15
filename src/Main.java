import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Введите путь к файлу lrc: ");
//        String name = in.nextLine();
        String nameInFile = "/home/kot/IdeaProjects/LRC-timeshifter2/src/NEW2.lrc";
        String nameOutFile = "/home/kot/IdeaProjects/LRC-timeshifter2/src/NEW222.lrc";

//        System.out.print("Введите смещение: ");
//        String shiftValue = in.nextLine();
        String shiftValue = "+00:01.20";
        float shiftInSec = ShiftLib.convertInSec(shiftValue);
        FileWorker.read(nameInFile, shiftInSec, nameOutFile);

    }

}
