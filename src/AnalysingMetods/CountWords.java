package AnalysingMetods;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountWords {
    public static void getCountWords(String file) throws IOException {
        int countWord = 0;
        try (Scanner sc = new Scanner(new File(file))) {
            while (sc.hasNextLine()) {
                String[] array = sc.nextLine().replaceAll("\\s+", " ").split(" ");
                countWord = countWord + array.length;
            }
            System.out.println("Количество слов = " + countWord);
        }
    }


}
