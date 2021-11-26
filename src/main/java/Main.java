import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {


    public static void main(String args[]) throws FileNotFoundException {
        DuplicatesRemoval.timeDuplicatesRemoval(new FileInputStream("packet_data.txt"));


    }
}