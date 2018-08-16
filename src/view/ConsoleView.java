package view;

public class ConsoleView {

    public static void enteringInputFile(){
        System.out.print("Введите путь к файлу lrc: ");
    }

    public static void enteringOutputFile() {
        String slash = String.valueOf(java.io.File.separatorChar);
        System.out.print("Выходной файл будет здесь: ".concat(System.getProperty("user.home").concat(slash).concat("out.txt")));
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
