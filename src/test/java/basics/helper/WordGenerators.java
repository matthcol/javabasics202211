package basics.helper;



import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class WordGenerators {

    public static Stream<Arguments> generateAnagramWords() {
        return Stream.of(
                Arguments.of("chien","niche"),
                Arguments.of("arbre", "barre")
        );
    }

    public static Stream<Arguments> generateNonAnagramWords() {
        return Stream.of(
                Arguments.of("chien","chat"),
                Arguments.of("chien","loups"),
                Arguments.of("chieen", "chiien")
        );
    }
}
