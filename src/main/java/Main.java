import service.TimeDuplicatesRemoval;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TimeDuplicatesRemoval timeDuplicatesRemoval = new TimeDuplicatesRemoval();
        timeDuplicatesRemoval.removeTimeDuplicate(new FileInputStream("packet_data.txt"));
    }
}