package AnalysingMetods;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberIdenticalWords {
    public static void getIdenticalWords(String file) throws IOException {
        try (Scanner scan = new Scanner(new File(file))) {
            String[] a = scan.nextLine().replaceAll("\\s+", " ").split(" ");
            Map<String, Integer> words = new HashMap<>();
            for (String str : a) {
                if (words.containsKey(str)) {
                    words.put(str, 1 + words.get(str));
                }
                else {
                    words.put(str, 1);
                }
            }
            System.out.println("Каждый фрукт или овощ встречается: " + words);
        }
    }
}
