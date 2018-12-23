import java.io.*;

final class ReadWriteFiles {

	private static final int LENGTH_OF_TIMECODE = 9;

    private static final String outputFile = "out.txt";

    static void read (final String inputFile, final String shiftValue) {
        float shiftInSec = ShiftLib.convertInSec(shiftValue);
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(inputFile)))) {
            String line = reader.readLine();
            while (line != null) {
                String temp = shiftTimeInLine(line, shiftInSec);
                write(temp);
                line = reader.readLine();
            }
        } catch (IOException e) {
            ConsoleView.readFileError();
        }
    }

    private static String shiftTimeInLine(final String line, final float shiftInSec) {
        String str = line.trim();
        if(str.length() < LENGTH_OF_TIMECODE) {
            return str;
        }
        if (str.charAt(0) == '[' &&  str.charAt(3) == ':' && str.charAt(LENGTH_OF_TIMECODE) == ']') {
              return ShiftLib.shifting(str, shiftInSec);
        }
        return str;
    }

    private static void write (final String line) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true))) {
            String lineSeparator = System.getProperty("line.separator");
            writer.write(line + lineSeparator);
            writer.flush();
        } catch (IOException e) {
            ConsoleView.writeFileError();
        }
    }
}
