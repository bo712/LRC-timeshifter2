import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Введите путь к файлу lrc: ");
//        String name = in.nextLine();
        String name = "/home/kot/IdeaProjects/LRC-timeshifter2/src/notes2.txt";

        String shiftValue = "+00:01.20";
//        System.out.print("Введите смещение: ");
//        String shiftValue = in.nextLine();

        try {
            FileReader reader = new FileReader(name);
        } catch(IOException ex){
            System.err.println(ex.getMessage());
        }
    }

}
