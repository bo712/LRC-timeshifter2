import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите путь к файлу lrc: ");
        String nameInFile = in.nextLine();

        System.out.print("Введите путь к целевой директории, куда будет помещён результат: ");
        String nameOutFile = in.nextLine().concat("/out.lrc");

        System.out.print("Введите смещение: ");
        String shiftValue = in.nextLine();

        FileWorker.read(nameInFile, shiftValue, nameOutFile);

    }

}
