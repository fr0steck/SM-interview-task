package service;

import model.Pair;

import java.io.InputStream;
import java.util.stream.Stream;

public interface DuplicatesRemoval {
    Stream<Pair> removeTimeDuplicate(InputStream inputStream);
}
