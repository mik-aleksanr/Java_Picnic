import AnalysingMetods.CountWords;
import AnalysingMetods.NumberIdenticalWords;
import AnalysingMetods.WordLength;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        CountWords.getCountWords("input.txt");
        WordLength.getWordLength("input.txt");
        NumberIdenticalWords.getIdenticalWords("input.txt");

    }
}