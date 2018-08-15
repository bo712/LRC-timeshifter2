package view;

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

    public static void readFileError() {
        System.err.println("Проблемы с чтением исходного файла =(");
    }

    public static void writeFileError() {
        System.err.println("Проблемы с записью результата в файл =(");
    }

}
