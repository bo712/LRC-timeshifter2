import java.io.*;

class FileWorker {

    static void read (final String inputFile, final String shiftValue, final String outputFile) {

        float shiftInSec = ShiftLib.convertInSec(shiftValue);

        try {
            File file = new File(inputFile);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();

            while (line != null) {
                String temp = shiftTimeInLine(line, shiftInSec, outputFile);
                write(outputFile, temp);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String shiftTimeInLine(final String line, final float shiftInSec, final String outputFile) {
        String str = line.trim();
        if(str.length() < 9) {
            return str;
        }
        if (str.charAt(0) == '[' &&  str.charAt(3) == ':' && str.charAt(9) == ']') {
              return ShiftLib.shifting(str, shiftInSec);
        }
        return str;
    }

    private static void write (final String outputFile, final String line){

        try {
            File newFile = new File(outputFile);
            BufferedWriter writer = new BufferedWriter(new FileWriter(newFile, true));
            String lineSeparator = System.getProperty("line.separator");
            writer.write(line + lineSeparator);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
