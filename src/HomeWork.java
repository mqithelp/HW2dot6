import java.util.*;

public class HomeWork {

    public static void getOddNums(List<Integer> nums) {
        List<Integer> odds = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) odds.add(num);
        }
        System.out.println("Нечетные числа: " + odds);
    }

    public static void getEvenNumsOne(List<Integer> nums) {
        Set<Integer> uniqueEven = new HashSet<>();
        Integer[] result;

        for (Integer num : nums) {
            if (num % 2 == 0) uniqueEven.add(num);
        }
        result = uniqueEven.toArray(new Integer[0]);
        Arrays.sort(result);
        System.out.println("Четные числа: " + Arrays.toString(result));
    }

    public static void getEvenNumsTwo(List<Integer> nums) {
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        System.out.print("Четные числа: ");
        for (Integer num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.print(num + " ");
                prevNum = num;
            }
        }
        System.out.println("");
    }


    public static void printCountDuplicateWords(List<String> strings) {
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

    public static void printUniqueWords(List<String> strings) {
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println("Уникальные слова: " + uniqueWords);
    }
}
