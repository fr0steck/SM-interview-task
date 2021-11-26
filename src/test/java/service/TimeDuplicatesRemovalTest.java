package service;

import model.Pair;
import service.TimeDuplicatesRemoval;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TimeDuplicatesRemovalTest {
    TimeDuplicatesRemoval timeDuplicatesRemovalTest = new TimeDuplicatesRemoval();

    @org.junit.jupiter.api.Test
    void timeDuplicatesRemoval() throws FileNotFoundException {
        //given
        InputStream inputStream = new FileInputStream("src/test/resources/packet_data_test1.txt");
        var expectedStream = Stream.of(new Pair(1615560000,1)
                ,new Pair(1615560024,0)
                ,new Pair(1615560030,1)
                ,new Pair(1615560037,0));

        //when
        Stream<Pair> pairStream = timeDuplicatesRemovalTest.removeTimeDuplicate(inputStream);

        //then
        assertArrayEquals(expectedStream.toArray(), pairStream.toArray());
    }

    @org.junit.jupiter.api.Test
    void timeDuplicatesRemovalEmptyCase() throws FileNotFoundException {
        //given
        InputStream inputStream = new FileInputStream("src/test/resources/packet_data_test2.txt");
        var expectedStream = Stream.of();

        //when
        Stream<Pair> pairStream = timeDuplicatesRemovalTest.removeTimeDuplicate(inputStream);

        //then
        assertArrayEquals(expectedStream.toArray(), pairStream.toArray());
    }

    @org.junit.jupiter.api.Test
    void timeDuplicatesRemovalCaseWith1s() throws FileNotFoundException {
        //given
        InputStream inputStream = new FileInputStream("src/test/resources/packet_data_test3.txt");
        var expectedStream = Stream.of(new Pair(1615560000,1));

        //when
        Stream<Pair> pairStream = timeDuplicatesRemovalTest.removeTimeDuplicate(inputStream);

        //then
        assertArrayEquals(expectedStream.toArray(), pairStream.toArray());
    }

    @org.junit.jupiter.api.Test
    void timeDuplicatesRemovalCaseWith0s() throws FileNotFoundException {
        //given
        InputStream inputStream = new FileInputStream("src/test/resources/packet_data_test4.txt");
        var expectedStream = Stream.of(new Pair(1615560000,0));

        //when
        Stream<Pair> pairStream = timeDuplicatesRemovalTest.removeTimeDuplicate(inputStream);

        //then
        assertArrayEquals(expectedStream.toArray(), pairStream.toArray());
    }

    @org.junit.jupiter.api.Test
    void timeDuplicatesRemovalCaseLong() throws FileNotFoundException {
        //given
        InputStream inputStream = new FileInputStream("src/test/resources/packet_data_test5.txt");
        var expectedStream = Stream.of(new Pair(1615560000,1)
                ,new Pair(1615560005,0)
                ,new Pair(1615560013,1)
                ,new Pair(1615560024,0)
                ,new Pair(1615560030,1)
                ,new Pair(1615560037,0)
                ,new Pair(1615560047,1)
                ,new Pair(1615560059,0)
                ,new Pair(1615560068,1)
                ,new Pair(1615560075,0)
                ,new Pair(1615560077,1)
                ,new Pair(1615560079,0)
                ,new Pair(1615560085,1)
                ,new Pair(1615560099,0));

        //when
        Stream<Pair> pairStream = timeDuplicatesRemovalTest.removeTimeDuplicate(inputStream);

        //then
        assertArrayEquals(expectedStream.toArray(), pairStream.toArray());
    }
}