import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

class ConsoleView {

    private ConsoleView() {
    }

    static void enteringInputFile(){
        System.out.print("Введите путь к файлу lrc: ");
    }

    static void enteringOutputFile() {
        String slash = String.valueOf(java.io.File.separatorChar);
        System.out.print("Выходной файл будет здесь: ".concat(System.getProperty("user.home").concat(slash).concat("out.txt")));
    }

    static void enteringShiftValue(){
        System.out.print("Введите смещение в формате \"+01:10.25\": ");
    }

    static void readFileError() {
        System.err.println("Проблемы с чтением исходного файла =(");
    }

    static void writeFileError() {
        System.err.println("Проблемы с записью результата в файл =(");
    }
}
