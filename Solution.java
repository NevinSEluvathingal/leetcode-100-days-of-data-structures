import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        
        System.out.println("Enter the target value:");
        int target = scanner.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        int[] result = solution.twoSum(nums, target);
        
        if (result.length == 2) {
            System.out.println("The indices of the two elements are: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
        
        scanner.close();
    }
}
