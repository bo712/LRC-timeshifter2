import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Введите путь к файлу lrc: ");
//        String name = in.nextLine();
        String name = "/home/kot/IdeaProjects/LRC-timeshifter2/src/NEW2.lrc";

        String shiftValue = "+00:01.20";
//        System.out.print("Введите смещение: ");
//        String shiftValue = in.nextLine();


        float ShiftInSec = ShiftLib.convertInSec(shiftValue);

        FileWorker.read(name);

    }

}
