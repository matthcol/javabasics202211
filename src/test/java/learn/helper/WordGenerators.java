package learn.helper;



import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class WordGenerators {

    public static Stream<Arguments> generateAnagramWords() {
        return Stream.of(
                Arguments.of("chien","niche"),
                Arguments.of("arbre", "barre")
        );
    }
}
