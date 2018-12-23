import org.slf4j.Logger;

class ConsoleView {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(ConsoleView.class);

    private ConsoleView() {
    }

    static void enteringInputFile(){
        log.info("Введите путь к файлу lrc: ");
    }

    static void enteringShiftValue(){
        log.info("Введите смещение в формате \"+01:10.25\": ");
    }

    static void readFileError() {
        log.error("Проблемы с чтением исходного файла =(");
    }

    static void writeFileError() {
        log.error("Проблемы с записью результата в файл =(");
    }
}
