import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 10, 2, 3, 40, -4, 5, 5, 6, 7,2));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        HomeWork.getOddNums(nums);
        HomeWork.getEvenNums(nums);
        HomeWork.printUniqueWords(strings);
        HomeWork.printCountDuplicateWords(strings);

    }


}