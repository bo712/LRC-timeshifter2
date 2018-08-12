import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("/home/kot/IdeaProjects/LRC-timeshifter2/src/notes2.txt");
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}
