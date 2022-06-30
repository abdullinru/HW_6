import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> str = new ArrayList<>();
        str.add("папа");
        str.add("мама");
        str.add("баба");
        str.add("дедушка");
        str.add("папа");
        str.add("мама");
        str.add("баба");
        str.add("дедушка");
        str.add("сестра");
        str.add("сын");
        str.add("дочь");

//        task1(nums);
//        task2(nums);
        task3(str);

    }
    public static void task1(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }

        }
    }

    public static void task2(List<Integer> nums) {
        Set<Integer> numSet = new HashSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                numSet.add(num);
            }
        }
        System.out.println(numSet);
    }
    public static void task3(List<String> str) {
        Set<String> str1 = new HashSet<>();
        for (String s : str) {
            str1.add(s);
        }
        System.out.println(str1);
    }
}

