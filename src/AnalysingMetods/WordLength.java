package AnalysingMetods;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class WordLength {
    public static void getWordLength(String file) throws IOException {
        try (Scanner scan = new Scanner(new File(file))) {
            String[] s = scan.nextLine().split(" ");
            Arrays.sort(s, (o1, o2) -> o2.length() - o1.length());
            System.out.println("Самое длинное название (слово) = " + s[0]);
        }
    }
}
