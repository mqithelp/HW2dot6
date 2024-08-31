import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        getOddNums(nums);
        getEvenNums(nums);
        printUniqueWords(strings);
        printCountDuplicateWords(strings);


    }

    private static void getOddNums(List<Integer> nums) {
        List<Integer> odds = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) odds.add(num);
        }
        System.out.println("Нечетные числа: " + odds);
    }

    private static void getEvenNums(List<Integer> nums) {
        List<Integer> odds = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 0) odds.add(num);
        }
        System.out.println("Четные числа: " + odds);
    }

    private static void printCountDuplicateWords(List<String> strings) {
        Map<String, Integer> countList = new HashMap<>();
        Integer count = 0;
        for (String string : strings) {
            countList.put(string, count);
        }
        for (String string : strings) {
            if (countList.containsKey(string)) {
                count = countList.get(string);
                countList.put(string, count + 1);
            }
        }

        System.out.println("Подсчет одинаковых слов: " + countList);
    }

    private static void printUniqueWords(List<String> strings) {
        Set uniqueWords = new HashSet<>(strings);
        System.out.println("Уникальные слова: " + uniqueWords);
    }

}