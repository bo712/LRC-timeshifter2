package model;

import viewer.ConsoleView;

import java.io.*;

public class ReadWriteFiles {

    public static void read (final String inputFile, final String shiftValue, final String outputFile) {

        float shiftInSec = ShiftLib.convertInSec(shiftValue);

        try {
            File file = new File(inputFile);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            while (line != null) {
                String temp = shiftTimeInLine(line, shiftInSec, outputFile);
                write(outputFile, temp);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            ConsoleView.readFileError();
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
            File file = new File(outputFile);
            FileWriter fw = new FileWriter(outputFile, true);
            BufferedWriter writer = new BufferedWriter(fw);
            String lineSeparator = System.getProperty("line.separator");
            writer.write(line + lineSeparator);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            ConsoleView.writeFileError();
        }
    }
}
