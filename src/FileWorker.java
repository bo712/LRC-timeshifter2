import java.io.*;

class FileWorker {

    static void read (final String inputFile, final float ShiftInSec) {

        try {
            File file = new File(inputFile);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                //сдвигаем в ней время, если строка подходит по маске
                String temp = shiftTimeInLine(line, ShiftInSec);

                //тут будет метод записи строки в конечный файл

                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String shiftTimeInLine(final String line, final float ShiftInSec) {
        String str = line.trim();
        //если это нужная для обработки строка
        if (str.charAt(0) == '[' &&  str.charAt(3) == ':' && str.charAt(9) == ']') {
            //тут запуск шифта
            return str;
        }
        return str;
    }

}
