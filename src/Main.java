import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
//        task1(nums);
        task2(nums);

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
}

