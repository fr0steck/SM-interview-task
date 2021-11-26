import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicatesRemoval {
    public static void timeDuplicatesRemoval(InputStream inputStream){

        //lista z parami czas/voltage
        List<Pair> pairList = new ArrayList<>();

        //lista z pojedynczymi liniami pakietow
        List<String> stringList = new ArrayList<>();

        //zapis z inputstreama do stringa
        String result = new BufferedReader(new InputStreamReader(inputStream))
                .lines().collect(Collectors.joining("\n"));

        //usuwanie dwukropka
        result = result.replaceAll(": "," ");

        //split stringa na pojedyncze linie (pakiety) i zapis do listy
        String lines[] = result.split("\\r?\\n");
        stringList = Arrays.asList(lines);



        //split pojedynczych lini (pakietow) na pary czas/voltage i zapis do listy
        for(String i : stringList)
        {
            String lines2[] = i.split("\\s");;
            pairList.add(new Pair(Long.parseLong(lines2[0]),Integer.parseInt(lines2[1])));
        }

        for(Pair i : pairList){
            System.out.print(i);
            System.out.println(System.lineSeparator());
        }




        //System.out.println(result);

    }


}