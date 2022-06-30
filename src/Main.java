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
//        task3(str);
        task4(str);

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
    public static void task4(List<String> str) {
        List<Integer> repeat = new ArrayList<>();

        while (str.size() > 0) {
            int i = 0;
            int count = 0;
            String s = str.get(i);
            while (str.contains(s)) {
                str.remove(s);
                count++;
            }
            if (count > 1) {
                repeat.add(count);
            }
        }

        System.out.println(repeat);
    }
}

