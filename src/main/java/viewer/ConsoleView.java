package viewer;

import org.slf4j.Logger;

public class ConsoleView {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(ConsoleView.class);

    private ConsoleView() {
    }

    public static void enteringInputFile(){
        log.info("Введите путь к файлу lrc: ");
    }

    public static void enteringShiftValue(){
        log.info("Введите смещение в формате \"+01:10.25\": ");
    }

    public static void readFileError() {
        log.error("Проблемы с чтением исходного файла =(");
    }

    public static void writeFileError() {
        log.error("Проблемы с записью результата в файл =(");
    }
}
