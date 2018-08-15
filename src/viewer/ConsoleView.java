package viewer;

public class ConsoleView {

    public static void enteringInputFile(){
        System.out.print("Введите путь к файлу lrc: ");
    }

    public static void enteringOutputFile(){
        System.out.print("Введите путь к целевой директории, куда будет помещён результат: ");
    }

    public static void enteringShiftValue(){
        System.out.print("Введите смещение в формате \"+01:10.25\": ");
    }

}
